package com.spring.example.springexample;

import com.spring.example.springexample.xml.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExampleXmlContextApplication {

    private static Logger LOG =
            LoggerFactory.getLogger(SpringExampleXmlContextApplication.class);

	public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOG.info("Beans loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());

            XmlPersonDao personDao = applicationContext.getBean(XmlPersonDao.class);

            LOG.info("{} dao - {}", personDao, personDao.getXmlJdbcConnection());
        }
    }

}
