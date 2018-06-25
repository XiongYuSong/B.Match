package hue.edu.xiong.java5minute.course2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Xiong
 * @Date: 2018/5/28 20:18
 */
@Controller
public class SongController {

    @RequestMapping(value = "/song")
    public String getSong(@RequestParam(name = "id", required = false) String songId) {
        if (songId == null) {
            songId = "1";
        }
        if (songId.equals("1")) {
            return "course2/1.html";
        } else {
            return "course2/other.html";
        }
    }
}
