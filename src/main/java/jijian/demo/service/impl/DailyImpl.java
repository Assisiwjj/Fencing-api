package jijian.demo.service.impl;

import jijian.demo.dao.DailyMapper;
import jijian.demo.domain.Daily;
import jijian.demo.domain.DailyExample;
import jijian.demo.domain.MatchRecord;
import jijian.demo.domain.UserExample;
import jijian.demo.service.DailyService;
import jijian.demo.utils.Base64;
import jijian.demo.utils.Constants;
import jijian.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class DailyImpl implements DailyService {
    @Autowired
    private DailyMapper dailyMapper;

    @Override
    public List<Daily> selectByDateOrLess(Date date, Integer limit){
        try{
            DailyExample example = new DailyExample();
            DailyExample.Criteria criteria = example.createCriteria();
            criteria.andDateLessThanOrEqualTo(date);
            example.setOrderByClause("Date desc");
            int count = (int) dailyMapper.countByExample(example);
            if(count>0) {
                example.setLimit(limit);
                List<Daily> dailyList = dailyMapper.selectByExample(example);
                for (Daily daily : dailyList) {
                    if (daily.getPicture() != null) {
                        daily.setPicture(Base64.toBase64(daily.getPicture()));
                    }
                }
                return dailyList;
            }else {
                return null;
            }
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Boolean insert(Daily daily, String suffix, String data){
        try{
            daily.setGmtCreate(new Date());
            daily.setGmtModified(new Date());
            daily.setPicture(uploadPicture(suffix, null, data, true));
            if (dailyMapper.insert(daily)==1){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int delete(Date date){
        try {
            DailyExample example = new DailyExample();
            DailyExample.Criteria criteria = example.createCriteria();
            criteria.andDateEqualTo(date);
            return dailyMapper.deleteByExample(example);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public String uploadPicture(String suffix, String FileName, String data, Boolean insert) throws RuntimeException {
        String fileName;
        try
        {
            //Base64解码
            byte[] b = Base64Utils.decodeFromString(data);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {
                    //调整异常数据
                    b[i]+=256;
                }
            }
            if(!insert){
                fileName = FileName;
                File oldFile = new File(Constants.getCurrenPath()+fileName);
                if(oldFile.exists()){
                    oldFile.delete();
                }
                fileName =  FileName.split("\\.")[0] + suffix;
            }else{
                fileName = UUID.randomUUID().toString() + suffix;
            }
            String imgFilePath = Constants.getCurrenPath()+fileName;
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return fileName;
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public PageBean getPageBean(Integer limit, Integer page) {
        try {
            DailyExample example = new DailyExample();
            DailyExample.Criteria criteria = example.createCriteria();
            int count = (int) dailyMapper.countByExample(example);
            if (count > 0) {
                PageBean pageBean = new PageBean(page, count, limit);
                example.setLimit(limit);
                example.setOffset(pageBean.getStart());
                example.setOrderByClause("Date desc");
                List<Daily> dailyList = dailyMapper.selectByExample(example);
                for(Daily daily : dailyList){
                    if(daily.getPicture()!=null){
                        daily.setPicture((Base64.toBase64(daily.getPicture())));
                    }
                }
                pageBean.setList(dailyList);
                return pageBean;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
