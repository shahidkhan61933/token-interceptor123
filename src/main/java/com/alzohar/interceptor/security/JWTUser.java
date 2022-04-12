package com.alzohar.interceptor.security;

import java.io.Serializable;

import lombok.Data;

@Data
public class JWTUser implements Serializable {
	private String username;
	private String password;	
}
