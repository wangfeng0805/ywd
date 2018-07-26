package com.yhxbank.ywd;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class YwdServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(YwdServerApplication.class).web(true).run(args);
	}

}
