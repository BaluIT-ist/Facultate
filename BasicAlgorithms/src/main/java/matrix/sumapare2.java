package matrix;

import java.util.Scanner;

public class sumapare2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int S = 0;   // even numbers sum
        int[][] baseMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                baseMatrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (baseMatrix[i][j] % 2 == 0) {
                    S = S + baseMatrix[i][j];
                }
            }

        }
        System.out.println(S);



    }
}
