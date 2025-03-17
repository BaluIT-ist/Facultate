package binarySearch;

import java.util.Scanner;

public class cautare_binara {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] VerifyArray = new int[m];
        int[] countingArray = new int[m]; //Retine daca exista nr sau nu

        for (int i = 0; i < m; i++) {
            VerifyArray[i] = sc.nextInt();
        }



        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = n - 1;

            while (low <= high) {
                int target = VerifyArray[i];
                int mid = low + (high - low) / 2;
                int value = inputArray[mid];

                if (target < value) {
                    high = mid-1;
                } else if (target > value) {
                    low = mid+1;
                } else {
                    countingArray[i] = 1;
                    break;
                }

            }

            if (low > high) {
                countingArray[i] = 0;
            }

        }


        for (int i = 0; i < m; i++) {
            System.out.println(" " + countingArray[i]);
        }


    }
}
