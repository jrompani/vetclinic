package com.microservice.oauth.config;

import com.microservice.oauth.security.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class InterceptorJwtConfig implements WebMvcConfigurer {

    @Value("${jms.jwt.security.enabled:false}")
    private boolean securityEnabled;

    @Autowired
    private Interceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        if(securityEnabled){
            registry.addInterceptor(interceptor);
        }
    }
}
