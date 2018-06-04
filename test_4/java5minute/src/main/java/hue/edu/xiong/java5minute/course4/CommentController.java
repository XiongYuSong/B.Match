package hue.edu.xiong.java5minute.course4;

import hue.edu.xiong.java5minute.course4.model.Comment;
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

    @RequestMapping(value = "/comments")
    public String comments(ModelMap modelMap) {
        List<Comment> commentList = getComment();
        modelMap.addAttribute("commentList", commentList);
        return "comment";
    }

    private List<Comment> getComment() {
        List<Comment> commentList = new ArrayList<>();
        Comment comment = new Comment();
        comment.setIcon("http://p1.music.126.net/lBtYhCnEPpDVKad-XIwz5A==/109951162896749127.jpg?param=50y50");
        comment.setNickName("Kukukikaka");
        comment.setContent("我真的是从头等到尾，你终于出来了，你的播放列表我真的快听烂了！这张专辑又要听三四年了！");
        comment.setCommentTime("2015年10月23日");
        comment.setLikeNum(20735);
        commentList.add(comment);

        comment = new Comment();
        comment.setIcon("http://p1.music.126.net/LgUqmVX11u6reJs15P8eLw==/3265549539856777.jpg?param=50y50");
        comment.setNickName("茶盏浮花");
        comment.setContent("每次单曲循环Hello的时候，就想起你。Hello刚发的第一天，你非得要我去听，我去听了，一开始感觉有点失望，就没再听。跟你分开后的某个深夜，赶报告的时候，歌单随机到Hello突然热泪盈眶。阿黛尔轻而易举戳的我无处躲藏。想你这件事情躲得过对酒当歌的夜，躲不过四下无人的街");
        comment.setCommentTime("2015年12月6日");
        comment.setLikeNum(13628);
        commentList.add(comment);

        return commentList;

    }
}
