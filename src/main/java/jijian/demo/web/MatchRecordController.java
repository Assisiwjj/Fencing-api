package jijian.demo.web;

import jijian.demo.domain.MatchRecord;
import jijian.demo.service.MatchRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/matchrecord")
public class MatchRecordController extends BaseController {
    @Autowired
    private MatchRecordService matchRecordService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Map<String, Object> getMatchRecordByOpenId(HttpServletRequest request) {
        msg.clear();
        try{
            String openId=request.getParameter("openId");
            if (openId!=null){
                List<MatchRecord> list = matchRecordService.selectByOpenId(openId);
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
                msg.put("msg", "openId为空");
            }
        }catch (Exception e){
            msg.put("code","0");
            msg.put("msg",e.getMessage());
        }
        return msg;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Map<String, Object> insert(@RequestBody MatchRecord matchRecord) {
        msg.clear();
        try{
            if (matchRecord.getOpenId()!=null){
                if (matchRecordService.insert(matchRecord)==true){
                    msg.put("code","1");
                    msg.put("msg","成功");
                }else {
                    msg.put("code","0");
                    msg.put("msg","失败");
                }
            }else {
                msg.put("code","0");
                msg.put("msg","传参不正确");
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
            String openId=request.getParameter("openId");
            Long pkId=Long.parseLong(request.getParameter("pkId"));
            if (openId != null && pkId!=null) {
                if (matchRecordService.delete(openId,pkId) == 1) {
                    msg.put("code", "1");
                    msg.put("msg", "成功");
                } else {
                    msg.put("code", "0");
                    msg.put("msg", "失败");
                }
            } else {
                msg.put("code", "0");
                msg.put("msg", "openId为空");
            }
        }catch (Exception e){
            msg.put("code","0");
            msg.put("msg", e.getMessage());
        }
        return msg;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Map<String, Object> update(@RequestBody MatchRecord matchRecord) {
        msg.clear();
        try{
            if (matchRecord.getOpenId() != null) {
                if (matchRecordService.update(matchRecord) == 1) {
                    msg.put("code", "1");
                    msg.put("msg", "成功");
                } else {
                    msg.put("code", "0");
                    msg.put("msg", "失败");
                }
            } else {
                msg.put("code", "0");
                msg.put("msg", "openId为空");
            }
        }catch (Exception e){
            msg.put("code","0");
            msg.put("msg", e.getMessage());
        }
        return msg;
    }
}
