package hue.edu.xiong.java5minute.course9;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Author: Xiong
 * @Date: 2018/6/23
 */
public class GlobalExceptionhandler implements ErrorViewResolver {

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("url",request.getRequestURI());
        mav.addAllObjects(model);
        mav.setViewName("error");
        return mav;
    }
}
