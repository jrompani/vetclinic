package com.microservice.oauth.controller;

import com.microservice.oauth.exceptions.UnauthorizedException;
import com.microservice.oauth.service.AuthService;
import com.microservice.oauth.validator.AuthValidator;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "v1.0")
public class OAuthController {

    @Autowired
    private AuthValidator authValidator;
    @Autowired
    private AuthService authService;

    @GetMapping("/loginCustom")
    public String muestraLogin(){
        return "muestra login";
    }

    @GetMapping("/pruebaJWT")
    public ResponseEntity<Object> pruebaJWT(){
        return ResponseEntity.ok("Version.1.0");
    }


    @PostMapping(path = "oauth/client_credential/accesstoken", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
               produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody MultiValueMap<String, String> paramMap, @RequestParam("grant_type") String grantType) throws UnauthorizedException {
        authValidator.validate(paramMap, grantType);

        return ResponseEntity.ok(authService.login(paramMap.getFirst("client_id"),paramMap.getFirst("client_secret")));
    }
}
