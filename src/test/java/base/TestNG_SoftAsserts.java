package base;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import appCode.someClassesToTest;
public class TestNG_SoftAsserts {

    @Test
    public void testSum(){
        SoftAssert sa = new SoftAssert();
        System.out.println("\n Running Test-> testSum");
        someClassesToTest obj = new someClassesToTest();
        int result = obj.sumNumbers(1,2);
        sa.assertEquals(result,2);
        System.out.println("This is the line after First assert");
        sa.assertEquals(result,3);
        System.out.println("This is the line after 2nd assert");
        sa.assertAll();
    }
}

