package com.example;

import org.testng.annotations.*;

public class TestProvider {
    @DataProvider(name = "Provider")
    public Object[][] getData() {
        return new Object[][]{
                {"Oksana", "27"},
                {"Mary", "43"},
                {"Kate", "19"}
        };
    }

    @Test(dataProvider = "Provider")
    public void resultFemale(String name, String age) {
        System.out.println("Name - " + name + "; Age - " + age);
    }

    @Test(dataProvider = "Provider", dataProviderClass = TestData.class)
    public void resultMale(String name, String age) {
        System.out.println("Name - " + name + "; Age - " + age);
    }
}
