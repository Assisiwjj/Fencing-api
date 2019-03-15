package jijian.demo.web;

import jijian.demo.domain.User;
import jijian.demo.service.UserService;
import jijian.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Map<String, Object> getUserByOpenId(HttpServletRequest request) {
        msg.clear();
        try{
            String openId=request.getParameter("openId");
            if (openId!=null){
                List<User> list = userService.selectByOpenId(openId);
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
    public Map<String, Object> insert(@RequestBody User user) {
        msg.clear();
        try{
            if (user.getOpenId()!=null){
                if (userService.insert(user)==true){
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
            if (openId != null) {
                if (userService.delete(openId) == 1) {
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
    public Map<String, Object> update(@RequestBody User user) {
        msg.clear();
        try{
            if (user.getOpenId() != null) {
                if (userService.update(user) == 1) {
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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Map<String, Object> getAllUser(HttpServletRequest request) {
        msg.clear();
        try{
            Integer limit = Integer.parseInt(request.getParameter("limit"));
            Integer page = Integer.parseInt(request.getParameter("page"));
            PageBean pageBean =userService.getPageBean(limit, page);
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
