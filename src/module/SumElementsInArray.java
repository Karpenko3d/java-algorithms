package module;

/**
 * TASK: You are given an array of integers. Please return their sum of
 * elements
 * 1. Input: What is the input parameter? => int arr[]
 * 2. Output: What should the datatype of function has to return? => void
 * 3. What data structures and methods associated with it will be used?
 * 4. Where are you going to store temp data (if method)?
 * 5. Describe model of your algorithms before implementing solution in code
 * 6. Write Unit Tests for solution (including edge cases)
 * 7. Complexity?
 */

public class SumElementsInArray {

    public int sumElements(int arr[]) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }
}
