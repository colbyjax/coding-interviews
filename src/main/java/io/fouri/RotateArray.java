package io.fouri;

import java.util.Scanner;
import java.lang.*;



/**
 * Rotate an Array of Size N by D turns clockwise
 * https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0
 *
 * Input:
 * The first line of the input contains T denoting the number of testcases. First line of each test case contains
 * two space separated elements, N denoting the size of the array and an integer D denoting the number size of
 * the rotation. Subsequent line will be the N space separated array elements.
 *
 * Output:
 * For each testcase, in a new line, output the rotated array.
 *
 * Constraints:
 * 1 <= T <= 200
 * 1 <= N <= 107
 * 1 <= D <= N
 * 0 <= arr[i] <= 105
 *
 * Example:
 * Input:
 * 2
 * 5 2
 * 1 2 3 4 5
 * 10 3
 * 2 4 6 8 10 12 14 16 18 20
 *
 * Output:
 * 3 4 5 1 2
 * 8 10 12 14 16 18 20 2 4 6
 * Explanation :
 * Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
 */
public class RotateArray {

    public static void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Test Cases: ");
        int numberOfTestCases = scan.nextInt();

        for (int eachTestCase = 0; eachTestCase < numberOfTestCases; eachTestCase++) {
            System.out.println("Enter size of Array, followed by the size of rotation: ");
            int arraySize = scan.nextInt();
            int rotation = scan.nextInt();
            //TODO: Validate rotation is less than arraySize

            int[] rawArray = new int[arraySize];

            System.out.println("Enter each element of the Array (delimiter spaces): ");
            for(int eachArrayElement=0; eachArrayElement < arraySize; eachArrayElement++) {
                rawArray[eachArrayElement] = scan.nextInt();
            }
            rotateArray(rawArray, rotation);
        }
    }

    /**
     * Helper method to output an array 'rotated' by a certain number
     * @param rawArray - Input Array to be rotated
     * @param rotation - The number of times to rotate
     */
    private static void rotateArray(int[] rawArray, int rotation) {
        StringBuffer output = new StringBuffer();

        /* Start at the rotation point */
        for(int point = rotation; point < rawArray.length; point++) {
            output.append(rawArray[point]);
            output.append(" ");
        }

        /* Now, go back to the beginning and add the 'rotation' elements */
        for(int point = 0; point < rotation; point++) {
            output.append(rawArray[point]);
            output.append(" ");
        }
        System.out.println(output);
    }

}
