package selenium.section11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample1 {

    @DataProvider(name = "testData")
    public static Object[][] testData() {
        return new Object[][]{
                {"John", 30},
                {"Emma", 28},
                {"Michael", 35}
        };
    }

    @Test(dataProvider = "testData")
    public void testMethod(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
