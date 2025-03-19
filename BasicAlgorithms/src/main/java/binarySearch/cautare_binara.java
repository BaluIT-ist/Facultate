package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class cautare_binara {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the first array
        int n = sc.nextInt();
        int[] inputArray = new int[n];

        for (int i = 0; i < n; i++) {
            inputArray[i] = sc.nextInt();
        }

        // Read the second array
        int m = sc.nextInt();
        int[] VerifyArray = new int[m];
        int[] countingArray = new int[m]; // Store results

        for (int i = 0; i < m; i++) {
            VerifyArray[i] = sc.nextInt();
        }

        // Binary search for each element in VerifyArray
        for (int i = 0; i < m; i++) {
            if (binarySearch(inputArray, VerifyArray[i])) {
                countingArray[i] = 1;
            } else {3
                countingArray[i] = 0;
            }
        }

        // Print results

        for (int i = 0; i < m; i++) {
            System.out.print(countingArray[i] + " ");
        }
    }

    // Custom binary search method
    public static boolean binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
