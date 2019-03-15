package jijian.demo.web;

import jijian.demo.domain.Career;
import jijian.demo.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/career")
public class CareerController extends BaseController{
    @Autowired
    private CareerService careerService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Map<String, Object> getCareerByOpenId(HttpServletRequest request) {
        msg.clear();
        try{
            String openId=request.getParameter("openId");
            if (openId!=null){
                List<Career> list = careerService.selectByOpenId(openId);
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
    public Map<String, Object> insert(@RequestBody Career career) {
        msg.clear();
        try{
            if (career.getOpenId()!=null){
                if (careerService.insert(career)==true){
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


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Map<String, Object> update(@RequestBody Career career) {
        msg.clear();
        try{
            if (career.getOpenId() != null) {
                if (careerService.update(career) == 1) {
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
