package subsequences;

import java.util.Scanner;

public class SubsecventeArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] V = new int[n];

        for(int i = 0;i<n;i++){
           V[i]= sc.nextInt();
         }



        for (int i = 0; i< n; i++) {
            for (int j = i; j <n ; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(V[k] + " ");
                }
                System.out.println();
            }
        }
    }
}