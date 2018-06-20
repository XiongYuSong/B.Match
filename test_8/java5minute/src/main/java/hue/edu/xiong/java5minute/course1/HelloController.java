package hue.edu.xiong.java5minute.course1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Xiong
 * @Date: 2018/5/24 20:30
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello";
    }
}
