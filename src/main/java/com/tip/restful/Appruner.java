package com.tip.restful;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@MapperScan({"com.tip.restful.*.*.dao*"})
@ServletComponentScan
@SpringBootApplication
public class Appruner extends SpringBootServletInitializer {


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Appruner.class);
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Appruner.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
