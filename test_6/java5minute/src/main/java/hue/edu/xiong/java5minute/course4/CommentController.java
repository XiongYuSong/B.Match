package hue.edu.xiong.java5minute.course4;

import hue.edu.xiong.java5minute.course4.model.Comment;
import hue.edu.xiong.java5minute.course5.CommentPostControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Xiong
 * @Date: 2018/6/4 21:26
 */
@Controller
public class CommentController {

    @Autowired
    private CommentPostControl commentPostControl;

    @RequestMapping(value = "/comments")
    public String comments(ModelMap modelMap) {
        List<Comment> commentList = commentPostControl.getComment("35847388");
        modelMap.addAttribute("commentList", commentList);
        return "comment";
    }
}
