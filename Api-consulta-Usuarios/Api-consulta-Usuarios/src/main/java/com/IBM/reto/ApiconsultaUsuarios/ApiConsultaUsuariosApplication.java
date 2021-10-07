package com.IBM.reto.ApiconsultaUsuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 
@EnableFeignClients
@EnableAsync
public class ApiConsultaUsuariosApplication {

	 @Bean
	  public Docket ConsultaUsuarios() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select() 
	        .apis(RequestHandlerSelectors.any()) 
	        .paths(PathSelectors.any()) 
	        .build();
	 }
	public static void main(String[] args) {
		SpringApplication.run(ApiConsultaUsuariosApplication.class, args);
	}

}
