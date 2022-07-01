package com.microservice.oauth.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class User implements Serializable {

    private static final long serialVersionUID = 3123299238L;

    private String uid;

    private String name;

    private String lastName;

    private String role;

    private String country;
}
