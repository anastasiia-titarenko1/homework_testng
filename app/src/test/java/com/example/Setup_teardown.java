package com.example;

import org.testng.annotations.*;
//import static org.testng.Assert.assertNotNull;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;

public class Setup_teardown {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Message from BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Message from AfterClass");
    }

    @Test
    public void homeST() {
        System.out.println("Test case in the current class");
    }
}
