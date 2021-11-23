package com.spring.example.springexample;

import com.spring.example.componentscan.ComponentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.example.componentscan")
public class SpringExampleComponentScanApplication {

    private static Logger LOG =
            LoggerFactory.getLogger(SpringExampleComponentScanApplication.class);

	public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringExampleComponentScanApplication.class)) {

            ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);

            LOG.info("{}", componentDao);
        }
	}
}
