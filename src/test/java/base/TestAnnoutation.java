package base;

import org.testng.annotations.Test;
import appCode.someClassesToTest;

public class TestAnnoutation {

    @Test
    public void test1(){
        someClassesToTest obj = new someClassesToTest();
        int result = obj.sumNumbers(1,4);
        System.out.println("ist is running");

    }
    @Test
    public void test2(){
        System.out.println("2nd is running");

    }
    @Test
    public void test3(){
        System.out.println("3rd is running");

    }

}