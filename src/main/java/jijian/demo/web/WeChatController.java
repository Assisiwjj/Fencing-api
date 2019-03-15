package jijian.demo.web;

import jijian.demo.utils.HttpUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/wechat")
public class WeChatController extends BaseController{
    @Value("wx8144c4c7a3a50d11")
    private String appId;

    @Value("0a8e066660fbefd24bab2d5dec07e784")
    private String secret;

    @Value("authorization_code")
    private String grantType;

    @Value("https://api.weixin.qq.com/sns/jscode2session")
    private String requestUrl;

    @RequestMapping(value = "/openid", method = RequestMethod.GET)
    public Map<String, Object> getOpenId(HttpServletRequest request) {
        msg.clear();
        try{
            String js_code=request.getParameter("js_code");
            if (js_code!=null){
                String url = this.requestUrl + "?appid=" + appId + "&secret=" + secret +
                        "&js_code=" + js_code + "&grant_type=" + grantType;
                String data = HttpUtil.get(url);
                String openId=new JSONObject(data).optString("openid");
                if (openId.equals("")) {
                    msg.put("code", "0");
                    msg.put("msg", "失败");
                }else {
                    msg.put("code", "1");
                    msg.put("msg", "成功");
                    msg.put("data", openId);
                }
            }else {
                msg.put("code", "0");
                msg.put("msg", "js_code为空");
            }
        }catch (Exception e){
            msg.put("code","0");
            msg.put("msg",e.getMessage());
        }
        return msg;
    }
}
