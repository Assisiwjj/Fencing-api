package jijian.demo.service;

import jijian.demo.domain.Career;

import java.util.List;

public interface CareerService {
    List<Career> selectByOpenId(String openId);

    Boolean insert(Career career);

    int update(Career career);
}
