package divideAndConquerAlgorithm;

import java.util.Scanner;

public class existaimparedivimp {


    private static int[] read(int m, Scanner sc) {

        int[] v = new int[m];
        for (int i = 0; i < m; i++) {
            v[i] = sc.nextInt();
        }

        return v;
    }

    private static String existOdd(int n, Scanner sc) {
        int[] v = read(n, sc);
        int low = 0;
        int high = n;

        int mid = (low + high) / 2;
        for (int i = 0; i <= mid; i++) {
            if (v[i] % 2 == 1) {
                return "DA";
            }


        }
             return "NU";

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println(existOdd(n, sc));


    }

}
