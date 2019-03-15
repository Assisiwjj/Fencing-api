package jijian.demo.service;

import jijian.demo.domain.User;
import jijian.demo.utils.PageBean;

import java.util.List;

public interface UserService {
    List<User> selectByOpenId(String openId);

    Boolean insert(User user);

    int delete(String openId);

    int update(User user);

    PageBean getPageBean(Integer limit, Integer page);
}
