package jijian.demo.dao;

import java.util.List;
import jijian.demo.domain.MatchRecord;
import jijian.demo.domain.MatchRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MatchRecordMapper {
    long countByExample(MatchRecordExample example);

    int deleteByExample(MatchRecordExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(MatchRecord record);

    int insertSelective(MatchRecord record);

    List<MatchRecord> selectByExample(MatchRecordExample example);

    MatchRecord selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") MatchRecord record, @Param("example") MatchRecordExample example);

    int updateByExample(@Param("record") MatchRecord record, @Param("example") MatchRecordExample example);

    int updateByPrimaryKeySelective(MatchRecord record);

    int updateByPrimaryKey(MatchRecord record);
}