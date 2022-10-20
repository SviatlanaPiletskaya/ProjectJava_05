import org.testng.annotations.Test;
import org.testng.Assert;

public class OddEvenTest {

    @Test
    public void testOdd_HappyPath() {
        int number = 345;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEven_HappyPath() {
        int number = 222222;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testZeroEven() {
        int number = 0;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
