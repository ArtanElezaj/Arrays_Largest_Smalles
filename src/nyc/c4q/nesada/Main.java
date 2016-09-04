/*

Given the an array of integers (example below), write:

int[] numbers = new int[]{ 2, 4, 4, 10, 10, 401, 101 };
a. A method that returns the index of the largest value in the array.

b. A method that returns the difference between the largest and smallest value in the array.

 */

package nyc.c4q.nesada;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[]{ 2, 4, 4, 10, 10, 401, 101 };
        System.out.println("The largest number of the given array is: "+ largestNum(numbers));
        System.out.println("The difference between the largest and smallest value in the given array is: "+ largest_smallest(numbers));
    }

    //this method returns the largest number of the given array
    public static int largestNum(int[] arr){
        int largN = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (largN < arr[i]){
                largN = arr[i];
            }
        }

        return largN;
    }

    //this method returns the difference between the largest and smallest elements of the given array
    public static int largest_smallest(int[] arr) {
        int largNum = arr[0];
        int smallNum = arr[0];
        int diff = 0;
        for (int i = 0; i<arr.length; i++){
            if (largNum < arr[i]){
                largNum = arr[i];
            }else if (smallNum > arr[i]){
                smallNum = arr[i];
            }
        }
        diff = largNum - smallNum;

        return diff;
    }
}
