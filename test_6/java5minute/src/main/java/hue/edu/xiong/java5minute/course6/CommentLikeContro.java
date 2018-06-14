package hue.edu.xiong.java5minute.course6;

import hue.edu.xiong.java5minute.course4.model.Comment;
import hue.edu.xiong.java5minute.course5.CommentPostControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: Xiong
 * @Date: 2018/6/14 9:38
 */
@Controller
public class CommentLikeContro {

    @Autowired
    private CommentPostControl commentPostControl;

    @RequestMapping(value = "/comment/like")
    @ResponseBody
    public Comment like(String songId, String commentId) {
        Comment result = null;
        List<Comment> commentList = commentPostControl.getComment(songId);
        for (Comment comment : commentList) {
            if (!comment.getId().equals(commentId)) {
                continue;
            }
            comment.setLikeNum(comment.getLikeNum() + 1);
            result = comment;
        }
        return result;
    }
}
