package jijian.demo.service.impl;

import jijian.demo.dao.UserMapper;
import jijian.demo.domain.User;
import jijian.demo.domain.UserExample;
import jijian.demo.service.UserService;
import jijian.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectByOpenId(String openId){
        try{
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andOpenIdEqualTo(openId);
            criteria.andIsDeleteEqualTo(false);
            List<User> list = userMapper.selectByExample(example);
            if (list.size()!=0){
                return list;
            }else {
                return null;
            }
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Boolean insert(User user){
        try{
            user.setGmtCreate(new Date());
            user.setGmtModified(new Date());
            user.setIsDelete(false);
            if (userMapper.insert(user)==1){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int delete(String openId){
        try {
            User user = new User();
            user.setIsDelete(true);
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andOpenIdEqualTo(openId);
            return userMapper.updateByExampleSelective(user,example);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int update(User user){
        try {
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andOpenIdEqualTo(user.getOpenId());
            return userMapper.updateByExampleSelective(user,example);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public PageBean getPageBean(Integer limit, Integer page) {
        try {
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andIsDeleteEqualTo(false);
            int count = (int) userMapper.countByExample(example);
            if (count > 0) {
                PageBean pageBean = new PageBean(page, count, limit);
                example.setLimit(limit);
                example.setOffset(pageBean.getStart());
                List<User> userList = userMapper.selectByExample(example);
                pageBean.setList(userList);
                return pageBean;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
