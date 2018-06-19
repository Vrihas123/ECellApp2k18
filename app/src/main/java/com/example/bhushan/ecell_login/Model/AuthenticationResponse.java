package com.example.bhushan.ecell_login.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticationResponse extends GenericResponse implements Serializable{

    @Expose
    private String token;

    public String getToken() {
        return token;
    }
}
