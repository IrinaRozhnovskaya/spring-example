package com.spring.example.springexample;

import com.spring.example.springexample.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringExampleCdiApplication {

    private static Logger LOG =
            LoggerFactory.getLogger(SpringExampleCdiApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringExampleCdiApplication.class)) {

            SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

            LOG.info("{} dao - {}", business, business.getSomeCdiDao());
        }
	}
}
