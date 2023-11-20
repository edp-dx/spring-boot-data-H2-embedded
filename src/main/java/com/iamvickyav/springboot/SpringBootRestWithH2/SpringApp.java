package com.iamvickyav.springboot.SpringBootRestWithH2;

import com.iamvickyav.springboot.SpringBootRestWithH2.service.SponsorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.iamvickyav.springboot.SpringBootRestWithH2.service")
@SpringBootApplication
public class SpringApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }

}

@SpringBootApplication
public class SpringApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}
}
