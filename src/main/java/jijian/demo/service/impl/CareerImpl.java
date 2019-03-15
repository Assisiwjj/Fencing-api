package jijian.demo.service.impl;

import jijian.demo.dao.CareerMapper;
import jijian.demo.domain.Career;
import jijian.demo.domain.CareerExample;
import jijian.demo.domain.UserExample;
import jijian.demo.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CareerImpl implements CareerService {
    @Autowired
    private CareerMapper careerMapper;

    @Override
    public List<Career> selectByOpenId(String openId){
        try{
            CareerExample example = new CareerExample();
            CareerExample.Criteria criteria = example.createCriteria();
            criteria.andOpenIdEqualTo(openId);
            List<Career> list = careerMapper.selectByExample(example);
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
    public Boolean insert(Career career){
        try{
            career.setAttack(0);
            career.setCounterattack(0);
            career.setDefend(0);
            career.setVictory(0);
            career.setTotal(0);
            career.setGmtCreate(new Date());
            career.setGmtModified(new Date());
            if (careerMapper.insert(career)==1){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int update(Career career){
        try {
            CareerExample example = new CareerExample();
            CareerExample.Criteria criteria = example.createCriteria();
            criteria.andOpenIdEqualTo(career.getOpenId());
            return careerMapper.updateByExampleSelective(career,example);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
