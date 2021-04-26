package com.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParam {
    @Parameters ({"firstname","lastname"})
    @Test
    public void paramTest (String firstname, String lastname) {
        System.out.println("User firstname " + firstname);
        System.out.println("User lastname " + lastname);
    }
}
