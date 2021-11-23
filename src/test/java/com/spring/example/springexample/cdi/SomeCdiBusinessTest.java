package com.spring.example.springexample.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {

    // Inject the mock
    @InjectMocks
    SomeCdiBusiness business;

    // Create a mock
    @Mock
    SomeCdiDao daoMock;

    @Test
    void test_basic_scenario() {
        when(daoMock.getData()).thenReturn(new int[] {2, 4});
        int actualResult = business.findGreatest();
        assertEquals(4, actualResult);
    }

    @Test
    void test_scenario_with_no_elements() {
        when(daoMock.getData()).thenReturn(new int[] {});
        int actualResult = business.findGreatest();
        assertEquals(Integer.MIN_VALUE, actualResult);
    }

    @Test
    void test_scenario_with_equal_elements() {
        when(daoMock.getData()).thenReturn(new int[] {2, 2});
        int actualResult = business.findGreatest();
        assertEquals(2, actualResult);
    }
}