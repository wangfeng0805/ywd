package com.yhxbank.ywd;

import com.yhxbank.ywd.filter.YwdAccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class YwdGateWayApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(YwdGateWayApplication.class).web(true).run(args);
	}

//	@Bean
	public YwdAccessFilter accessFilter() {
		return new YwdAccessFilter();
	}

}
