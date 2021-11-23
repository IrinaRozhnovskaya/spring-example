package com.spring.example.springexample;

import com.spring.example.springexample.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringExampleBasicApplication {

    // What are the beans?
    // What are the dependencies of a bean?
    // Where to search for beans? -> No need

	public static void main(String[] args) {

        // BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringExampleBasicApplication.class)) {

            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

            int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
            System.out.println(result);
        }
    }

}
