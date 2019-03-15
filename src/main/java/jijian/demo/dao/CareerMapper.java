package jijian.demo.dao;

import java.util.List;
import jijian.demo.domain.Career;
import jijian.demo.domain.CareerExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CareerMapper {
    long countByExample(CareerExample example);

    int deleteByExample(CareerExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Career record);

    int insertSelective(Career record);

    List<Career> selectByExample(CareerExample example);

    Career selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Career record, @Param("example") CareerExample example);

    int updateByExample(@Param("record") Career record, @Param("example") CareerExample example);

    int updateByPrimaryKeySelective(Career record);

    int updateByPrimaryKey(Career record);
}