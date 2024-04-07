package org.example;

import com.beust.jcommander.Parameter;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestingD {



   @Test(groups = {"group1"})
    public void test9()
    {
        System.out.println("Test9 executed");
    }
    @Test(groups = {"group2"})
    public void test10()
    {
        System.out.println("Test10 executed");
    }
    @Test
    public void test11()
    {
        System.out.println("Test11 executed");
    }
    @Test(groups = {"group1"})
    public void test12()
    {
        System.out.println("Test12 executed");
    }


}
