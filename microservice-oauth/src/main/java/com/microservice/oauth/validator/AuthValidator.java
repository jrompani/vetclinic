package com.microservice.oauth.validator;

import com.microservice.oauth.exceptions.UnauthorizedException;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import java.util.Objects;

@Component
public class AuthValidator {
    private static final String CLIENT_CREDENTIALS = "client_credentials";
    private String message;

    public void validate(MultiValueMap<String, String> paramMap, String grant_type) throws UnauthorizedException {
        if(grant_type.isEmpty() || !grant_type.equals(CLIENT_CREDENTIALS)){
            message("El campo grant_type no es correcto.");
        }

        if(Objects.isNull(paramMap) || paramMap.getFirst("client_id").isEmpty() || paramMap.getFirst("client_secret").isEmpty()){
            message("El clientId o clientSecret es invalido.");
        }
    }

    public void message(String message) throws UnauthorizedException {
        throw new UnauthorizedException(message);
    }
}
