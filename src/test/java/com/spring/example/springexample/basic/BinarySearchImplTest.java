package com.spring.example.springexample.basic;

import com.spring.example.springexample.SpringExampleBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

// Load the context
@ContextConfiguration(classes = SpringExampleBasicApplication.class)
@ExtendWith(SpringExtension.class)
class BinarySearchImplTest {

    // Get this bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    void test_basic_scenario() {
        // call method on binarySearch
        int actualResult = binarySearch.binarySearch(new int[] {}, 5);
        // check if the value is correct
        assertEquals(3, actualResult);
    }
}