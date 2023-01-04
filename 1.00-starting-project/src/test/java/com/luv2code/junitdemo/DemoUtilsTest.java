package com.luv2code.junitdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {
    DemoUtils demo = new DemoUtils();

    @Test
    void testEqualsAndNotEquals(){
        assertEquals(6,demo.add(3,3));
        assertNotEquals(5,demo.add(2,-3));
    }

    @Test
    void testNullAndNotNull(){
        assertNull(demo.checkNull(null));
        assertNotNull(demo);
    }
}