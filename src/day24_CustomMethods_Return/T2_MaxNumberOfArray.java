package day24_CustomMethods_Return;

public class T2_MaxNumberOfArray {

    public static void main(String[] args) {

        int[] arr1 = {5, 8, 15, 2, 80, -5, 90, 1, 7};

        int maxNum = maxNumber(arr1);

        System.out.println(maxNum);

    }


    public static int maxNumber(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;

    }


}
