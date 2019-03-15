package jijian.demo.service;

import jijian.demo.domain.BasicJoint;

public interface basicJoint {
    int deleteByPrimaryKey(Integer id);

    int insert(BasicJoint record);

    BasicJoint selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(BasicJoint record);


}
