package com.reverse;

import org.junit.Test;

import java.util.Date;

public class MainTest {

    @Test
    public void test() {
        Date date = new Date("2021-09-22");
        System.out.println("date.getDate() = " + date.getDate());
    }
}
