package jijian.demo.service;

import jijian.demo.domain.Daily;
import jijian.demo.utils.PageBean;

import java.util.Date;
import java.util.List;

public interface DailyService {
    List<Daily> selectByDateOrLess(Date date, Integer limit);

    Boolean insert(Daily daily, String suffix, String data);

    int delete(Date date);

    String uploadPicture(String suffix, String FileName, String data, Boolean insert);

    PageBean getPageBean(Integer limit, Integer page);
}
