package com.microservice.oauth.service;

import com.microservice.oauth.model.JwtResponse;
import com.microservice.oauth.model.User;
import com.microservice.oauth.security.JwtModel;
import com.microservice.oauth.utils.DateUtils;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@NoArgsConstructor
public class AuthService {

    @Autowired
    private JwtModel jwtModel;
    @Autowired
    private DateUtils dateUtils;

    @Value("${jms.jwt.token.expiresIn}")
    private int EXPIRES_IN;



    public AuthService(JwtModel jwtModel, DateUtils dateUtils) {
        this.jwtModel = jwtModel;
        this.dateUtils = dateUtils;
    }

    public JwtResponse login(String clientId, String clientSecret){
        UUID uid = UUID.randomUUID();

        User userDto = User.builder().name("Pedro").lastName("Miam").role("ADMIN").country("Suecia").uid(uid.toString()).build();

        JwtResponse jwt = JwtResponse.builder().tokenType("bearer").accessToken(jwtModel.generateToken("Pruebo Token"))
                .issuedAt(dateUtils.getDateMills() + "")
                .clientId(uid.toString())
                .expiresIn(EXPIRES_IN).build();
        return jwt;
    }
}
