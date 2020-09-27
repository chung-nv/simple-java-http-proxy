package com.chungnv.simplejavaproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SimpleJavaProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleJavaProxyApplication.class, args);
	}

}
