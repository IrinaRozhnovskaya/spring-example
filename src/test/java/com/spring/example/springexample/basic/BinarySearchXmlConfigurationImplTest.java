package com.spring.example.springexample.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Load the context
@ContextConfiguration(locations="/testContext.xml")
@ExtendWith(SpringExtension.class)
class BinarySearchXmlConfigurationImplTest {

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