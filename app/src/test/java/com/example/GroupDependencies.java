package com.example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class GroupDependencies {
    @BeforeGroups ("Group_1")
    public void setupGroup() { System.out.println("Message from BeforeGroup_1"); }

    @AfterGroups ("Group_1")
    public void teardownGroup() {
        System.out.println("Message from AfterGroup_1");
    }

    @Test (groups= "Group_1")
    public void groupFirst() {
        System.out.println("Message from Group_1");
    }

    @Test (groups= "Group_2")
    public void groupSecond() {
        System.out.println("Message from Group_2");
    }

    @Test (groups= "Group_3")
    public void groupThird() {
        System.out.println("Exclude Group_3");
    }

//    @Test (dependsOnGroups = {"Group_1","Group_2"})
//    public void runTest() {
//        System.out.println("It's the final countdown");
//    }
}
