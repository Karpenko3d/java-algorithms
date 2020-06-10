package tests;

import module.SumElementsInArray;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SumElementsInArrayTest {

    @Test // Test Case-1: Happy Pass!
    public void testSumElements() {
        SumElementsInArray sumElementsInArray = new SumElementsInArray();
        int array[] = {7, 5, -5, 6, 9};
        int expectedResult = 22;
        int actualResult = sumElementsInArray.sumElements(array);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test // Test Case-2: If Array can be empty?
    public void testSumEmptyElements() {
        SumElementsInArray sumElementsInArray = new SumElementsInArray();
        int array[] = {};
        int expectedResult = 0;
        int actualResult = sumElementsInArray.sumElements(array);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test // Test Case-3: One element?
    public void testSumOneElement() {
        SumElementsInArray sumElementsInArray = new SumElementsInArray();
        int array[] = {22};
        int expectedResult = 22;
        int actualResult = sumElementsInArray.sumElements(array);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
