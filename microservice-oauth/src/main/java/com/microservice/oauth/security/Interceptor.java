package com.microservice.oauth.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Component
public class Interceptor implements HandlerInterceptor {

    @Autowired
    private JwtModel jwm;


    @Value("${jms.jwt.token.auth.path}")
    private String AUTH_PATH;

    @Value("#{'${jms.jwt.exclude.path}'.split(',')}")
    private List<String> excluded;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean validate = false;

        String url = request.getRequestURI();

        if(url.equals(AUTH_PATH) || isExcluded(url)){
            validate = true;
        }

        if(!validate && request.getHeader("Authorization")!= null && !request.getHeader("Authorization").isEmpty())
        {
            String token = request.getHeader("Authorization").replace("Bearer","");

            validate = jwm.validateToken(token);
        }

        if(!validate){
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
        }

        return validate;
    }

    private boolean isExcluded(String path){
        boolean result = false;

        for (String s : excluded) {
            if(s.equals("#") && s.equals(path) ){
                result = true;
            }
        }

        return result;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
