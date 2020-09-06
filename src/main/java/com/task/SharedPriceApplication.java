package com.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableScheduling
@EnableSwagger2
public class SharedPriceApplication {

     public static void main(String[] args){

         SpringApplication.run(SharedPriceApplication.class, args);

    }

    public Docket swaggerConfiguration(){

         return new Docket(DocumentationType.SWAGGER_2)
                 .select()
                 .paths(PathSelectors.ant("/stockPrices/*"))
                 .build();
    }
}
