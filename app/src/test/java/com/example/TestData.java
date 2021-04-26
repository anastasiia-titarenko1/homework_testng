package com.example;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "Provider")
    public Object[][] getData() {
        return new Object[][]{
                {"Michael", "66"},
                {"Alex", "45"},
                {"Jack", "21"}
        };
    }
}
