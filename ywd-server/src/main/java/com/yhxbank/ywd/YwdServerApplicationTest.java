package com.yhxbank.ywd;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

public class YwdServerApplicationTest {

	public static void test(String[] args) {
		new SpringApplicationBuilder(YwdServerApplicationTest.class).web(true).run(args);
	}

}
