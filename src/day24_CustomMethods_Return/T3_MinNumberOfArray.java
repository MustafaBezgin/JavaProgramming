package day24_CustomMethods_Return;

public class T3_MinNumberOfArray {

    public static void main(String[] args) {

        int[] arr1 = {5, 8, 15, 2, 80, -5, 90, 1, 7};

        int minimumNum = minNumber(arr1);

        System.out.println(minimumNum);

    }


    public static int minNumber(int[] arr) {

        int minNum = arr[0];

        for (int each : arr) {

            if (minNum > each) {
                minNum = each;
            }
        }

        return minNum;

    }

}
