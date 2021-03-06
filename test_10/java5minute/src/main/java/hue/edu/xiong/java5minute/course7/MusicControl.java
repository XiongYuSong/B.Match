package hue.edu.xiong.java5minute.course7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Xiong
 * @Date: 2018/6/16 18:43
 */
@Controller
public class MusicControl {
    private static Map<String, String> musics = new HashMap<>();

    @RequestMapping(value = "/song/music")
    @ResponseBody
    public String getMusicSrc(String songId) {
        return musics.get(songId);
    }

    /**
     * @PostComstruct 注解作用，本类实例化时候自动运行
     *
     */
    @PostConstruct
    public void init() {
        musics.put("35847388", "http://m10.music.126.net/20180620145031/f75e813894391978a17dc1de6982fa2f/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3");
        musics.put("16435049", "http://m10.music.126.net/20180620144522/f60a1e3d6cf16e31bfcc7676439e4231/ymusic/0cce/0768/52ed/db86bd40d6ba02bc4dc09cc942216662.mp3");

    }
}
