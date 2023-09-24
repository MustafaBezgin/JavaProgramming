package day24_CustomMethods_Return;

import java.util.Arrays;

public class T5_MergeTwoArray {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6}, array2 = {7, 8, 9, 10};

        int[] array3 = mergeTwoArray(array1, array2);

        System.out.println(Arrays.toString(array3));

    }


    public static int[] mergeTwoArray(int[] arr1, int[] arr2) {

        int[] mergedArray = new int[arr1.length + arr2.length];
        int j = 0;

        for (int i = 0; i < arr1.length; i++) {

            mergedArray[j] = arr1[i];
            j++;

        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[j] = arr2[i];
            j++;
        }

        return mergedArray;

    }

}
