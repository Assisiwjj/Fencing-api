package jijian.demo.service.impl;

import jijian.demo.dao.MatchRecordMapper;
import jijian.demo.domain.MatchRecord;
import jijian.demo.domain.MatchRecordExample;
import jijian.demo.domain.UserExample;
import jijian.demo.service.MatchRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MathRecordImpl implements MatchRecordService {
    @Autowired
    private MatchRecordMapper matchRecordMapper;

    @Override
    public List<MatchRecord> selectByOpenId(String openId){
        try{
            MatchRecordExample example = new MatchRecordExample();
            MatchRecordExample.Criteria criteria = example.createCriteria();
            criteria.andOpenIdEqualTo(openId);
            example.setOrderByClause("gmt_create desc");
            List<MatchRecord> list = matchRecordMapper.selectByExample(example);
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
    public Boolean insert(MatchRecord matchRecord){
        try{
            matchRecord.setGmtCreate(new Date());
            matchRecord.setGmtModified(new Date());
            if (matchRecordMapper.insert(matchRecord)==1){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int delete(String openId,Long pkId){
        try {
            MatchRecordExample example = new MatchRecordExample();
            MatchRecordExample.Criteria criteria = example.createCriteria();
            criteria.andOpenIdEqualTo(openId);
            criteria.andPkIdEqualTo(pkId);
            return matchRecordMapper.deleteByExample(example);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int update(MatchRecord matchRecord){
        try {
            MatchRecordExample example = new MatchRecordExample();
            MatchRecordExample.Criteria criteria = example.createCriteria();
            criteria.andOpenIdEqualTo(matchRecord.getOpenId());
            return matchRecordMapper.updateByExampleSelective(matchRecord,example);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
