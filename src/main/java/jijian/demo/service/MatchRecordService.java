package jijian.demo.service;

import jijian.demo.domain.MatchRecord;

import java.util.List;

public interface MatchRecordService {
    List<MatchRecord> selectByOpenId(String openId);

    Boolean insert(MatchRecord matchRecord);

    int delete(String openId,Long pkId);

    int update(MatchRecord user);
}
