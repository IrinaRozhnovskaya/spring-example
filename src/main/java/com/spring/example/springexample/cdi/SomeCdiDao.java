package com.spring.example.springexample.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {

    public int[] getData() {
        return new int[] {2, 15, 100};
    }
}
