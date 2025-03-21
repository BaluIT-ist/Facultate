package matrix;

import java.util.Scanner;

public class sumalinii {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] baseMatrix = new int[n][m];
        int[] sumArray=new int[n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                baseMatrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int s = 0 ;
            for (int j = 0; j < m; j++) {
                s=s+baseMatrix[i][j];

            }
            sumArray[i]=s;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(sumArray[i]+" ");
        }

    }
}
