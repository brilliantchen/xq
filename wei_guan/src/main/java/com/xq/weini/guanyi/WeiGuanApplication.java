package com.xq.weini.guanyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeiGuanApplication {

	public static void main(String[] args) {
		System.setProperty("DEPLOY_ENV", "test");
		SpringApplication.run(WeiGuanApplication.class, args);
	}
}
