package matrix;

import java.util.Scanner;

public class nrprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mainMatrix = new int[n][m];
        int c = 0; // Counter for prime numbers

        // Read the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mainMatrix[i][j] = sc.nextInt();
            }
        }

        // Loop through even-indexed rows (1-based index => odd indices in 0-based)
        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < m; j++) {
                int num = mainMatrix[i][j];
                boolean isPrime = true;

                if (num < 2) {
                    isPrime = false;
                } else {
                    for (int k = 2; k * k <= num; k++) { // Prime check loop
                        if (num % k == 0) {
                            isPrime = false;
                            break; // Exit early if a divisor is found
                        }
                    }
                }

                if (isPrime) {
                    c++; // Count prime numbers
                }
            }
        }

        // Output result
        System.out.println(c);
    }
}
