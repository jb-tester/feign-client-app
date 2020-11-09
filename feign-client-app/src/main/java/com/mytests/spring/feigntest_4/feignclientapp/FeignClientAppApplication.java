package com.mytests.spring.feigntest_4.feignclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableFeignClients(clients = {MyClient2.class, MyClient0.class})
public class FeignClientAppApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FeignClientAppApplication.class);
		ConfigurableApplicationContext context = app.run(args);
		ClientsService service = null;
		service = context.getBean(ClientsService.class);
		System.out.println("**********************************");
		System.out.println(service.checkClients());
		System.out.println("**********************************");
	}

}
