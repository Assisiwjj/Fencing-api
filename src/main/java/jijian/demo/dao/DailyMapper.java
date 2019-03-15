package jijian.demo.dao;

import java.util.List;
import jijian.demo.domain.Daily;
import jijian.demo.domain.DailyExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DailyMapper {
    long countByExample(DailyExample example);

    int deleteByExample(DailyExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Daily record);

    int insertSelective(Daily record);

    List<Daily> selectByExample(DailyExample example);

    Daily selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Daily record, @Param("example") DailyExample example);

    int updateByExample(@Param("record") Daily record, @Param("example") DailyExample example);

    int updateByPrimaryKeySelective(Daily record);

    int updateByPrimaryKey(Daily record);
}