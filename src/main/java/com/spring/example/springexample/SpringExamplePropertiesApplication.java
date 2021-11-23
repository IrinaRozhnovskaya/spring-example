package com.spring.example.springexample;

import com.spring.example.springexample.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringExamplePropertiesApplication {

	public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringExamplePropertiesApplication.class)) {

            SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

            System.out.println(service.getServiceUrl());
        }
    }

}
