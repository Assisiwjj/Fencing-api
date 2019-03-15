package jijian.demo.web;

import jijian.demo.domain.Daily;
import jijian.demo.service.DailyService;
import jijian.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/daily")
public class DailyController extends BaseController{
    @Autowired
    private DailyService dailyService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Map<String, Object> getUserByDate(HttpServletRequest request) {
        msg.clear();
        try{
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
            if (date!=null){
                Integer limit = Integer.parseInt(request.getParameter("limit"));
                List<Daily> list = dailyService.selectByDateOrLess(date,limit);
                if (list!=null) {
                    msg.put("code", "1");
                    msg.put("msg", "成功");
                    msg.put("data", list);
                }else {
                    msg.put("code", "0");
                    msg.put("msg", "数据为空");
                }
            }else {
                msg.put("code", "0");
                msg.put("msg", "键值为空");
            }
        }catch (Exception e){
            msg.put("code","0");
            msg.put("msg",e.getMessage());
        }
        return msg;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Map<String, Object> insert(HttpServletRequest request, @RequestBody Daily daily){
        msg.clear();
        try{
            String dataPrix = "";
            String data = "";
            String base64Data = daily.getPicture();
            if(base64Data == null || "".equals(base64Data)){
                msg.put("code","0");
                msg.put("msg","上传失败，上传图片数据为空");
                return msg;
            }else{
                String [] d = base64Data.split("base64,");
                if(d != null && d.length == 2){
                    dataPrix = d[0];
                    data = d[1];
                    daily.setPicture(null);
                }else{
                    msg.put("code","0");
                    msg.put("msg","上传失败，数据不合法");
                    return msg;
                }
            }

            String suffix = "";
            if("data:image/jpeg;".equalsIgnoreCase(dataPrix)){
                //data:image/jpeg;base64,base64编码的jpeg图片数据
                suffix = ".jpg";
            } else if("data:image/x-icon;".equalsIgnoreCase(dataPrix)){
                //data:image/x-icon;base64,base64编码的icon图片数据
                suffix = ".ico";
            } else if("data:image/gif;".equalsIgnoreCase(dataPrix)){
                //data:image/gif;base64,base64编码的gif图片数据
                suffix = ".gif";
            } else if("data:image/png;".equalsIgnoreCase(dataPrix)){
                //data:image/png;base64,base64编码的png图片数据
                suffix = ".png";
            }else{
                msg.put("code","0");
                msg.put("msg","上传图片格式不合法");
                return msg;
            }


            if (daily.getDate()!=null && daily.getChinese()!=null && daily.getEnglish()!=null
                    && daily.getSentence()!=null){
                if (dailyService.insert(daily,suffix,data)==true) {
                    msg.put("code", "1");
                    msg.put("msg", "成功");
                }else {
                    msg.put("code", "0");
                    msg.put("msg", "失败");
                }
            }else
            {
                msg.put("code","0");
                msg.put("msg","请传入完整参数");
            }
        }catch (Exception e){
            msg.put("code","0");
            msg.put("msg",e.getMessage());
        }
        return msg;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Map<String, Object> delete(HttpServletRequest request) {
        msg.clear();
        try{
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
            if (date != null) {
                if (dailyService.delete(date) == 1) {
                    msg.put("code", "1");
                    msg.put("msg", "成功");
                } else {
                    msg.put("code", "0");
                    msg.put("msg", "失败");
                }
            } else {
                msg.put("code", "0");
                msg.put("msg", "键值为空");
            }
        }catch (Exception e){
            msg.put("code","0");
            msg.put("msg", e.getMessage());
        }
        return msg;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Map<String, Object> getAllDaily(HttpServletRequest request) {
        msg.clear();
        try{
            Integer limit = Integer.parseInt(request.getParameter("limit"));
            Integer page = Integer.parseInt(request.getParameter("page"));
            PageBean pageBean =dailyService.getPageBean(limit, page);
            msg.put("code", "1");
            msg.put("msg", "成功");
            msg.put("data", pageBean);
        }catch (Exception e){
            msg.put("code","0");
            msg.put("msg",e.getMessage());
        }
        return msg;
    }
}
