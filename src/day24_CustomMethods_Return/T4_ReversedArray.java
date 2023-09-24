package day24_CustomMethods_Return;

import java.util.Arrays;

public class T4_ReversedArray {

    public static void main(String[] args) {

        int[] arr1 = {5, 8, 15, 2, 80, -5, 90, 1, 7};

        arr1 = reversedArray(arr1);

        System.out.println(Arrays.toString(arr1));

    }


    public static int[] reversedArray(int[] arr) {

        int[] reversedArray = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            reversedArray[j] = arr[i];
            j++;

        }

        return reversedArray;
    }

}
