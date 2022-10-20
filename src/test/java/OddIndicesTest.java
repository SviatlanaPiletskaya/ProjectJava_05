import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    @Test
    public void testEvenNumberElementArr_HappyPath(){

        int[] arrays = {-45, 590, 234, 985, 12, 68};

        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().oddIndices(arrays);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOddNumberElementArr_HappyPath(){

        int[] arrays = {-45, 590, 234, 985, 12};

        int[] expectedResult = {590, 985};

        int[] actualResult = new OddIndices().oddIndices(arrays);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNullElementArr(){

        int[] arrays = {};

        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(arrays);
        Assert.assertEquals(actualResult, expectedResult);
    }



}
