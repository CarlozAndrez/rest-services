package com.rest.services.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class AppProperties {
	
	@Autowired
	private Environment env;
	
	public String getTokenFromPorperty() {
		return env.getProperty("tokenSecret");
	}
}
