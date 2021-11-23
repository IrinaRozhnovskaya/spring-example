package com.spring.example.springexample;

import com.spring.example.springexample.scope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringExampleScopeApplication {

    private static Logger LOG =
            LoggerFactory.getLogger(SpringExampleScopeApplication.class);

	public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringExampleScopeApplication.class)) {

            PersonDao personDao = applicationContext.getBean(PersonDao.class);

            PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

            LOG.info("{}", personDao);
            LOG.info("{}", personDao.getJdbcConnection()); // if we use a proxy all JdbsConnection instances are different
            LOG.info("{}", personDao.getJdbcConnection()); // if we use a proxy all JdbsConnection instances are different

            LOG.info("{}", personDao2);
            LOG.info("{}", personDao2.getJdbcConnection()); // if we use a proxy all JdbsConnection instances are different
        }
	}
}
