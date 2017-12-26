package base;
import org.testng.Assert;
import org.testng.annotations.Test;
import appCode.someClassesToTest;


public class TestNG_Asserts {


        @Test
        public void testSum() {
            System.out.println("\nRunning Test -> testSum");
            someClassesToTest obj = new someClassesToTest();
            int result = obj.sumNumbers(1, 2);
            Assert.assertEquals(result, 3);
        }

        @Test
        public void testStrings() {
            System.out.println("\nRunning Test -> testStrings");
            String expectedString = "Hello World";
            someClassesToTest obj = new someClassesToTest();
            String result = obj.addStrings("Hello", "World");
            Assert.assertEquals(result, expectedString);
        }

        @Test
        public void testArrays() {
            System.out.println("\nRunning Test -> testArrays");
            int[] expectedArray = {1, 2, 3};
            someClassesToTest obj = new someClassesToTest();
            int[] result = obj.getArray();
            Assert.assertEquals(result, expectedArray);
            System.out.println("End Test -> testArrays");
        }
    }
