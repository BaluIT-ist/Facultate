package divideAndConquerAlgorithm;

import java.util.Scanner;

public class sumvec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []v = new int [n];
        int S1=0;
        int S2=0;
        int Stotal=0;
        int low=0;
        int high=n;

        for(int i = 0;i<n;i++)
        {
            v[i]=sc.nextInt();
        }


        int mid = (low + high) / 2;

        for(int i=0;i<=mid;i++)
        {
            S1=S1+v[i];
        }

        for(int i =mid+1;i<n;i++)
        {
            S2=S2+v[i];
        }

        Stotal=S1+S2;
        System.out.println(Stotal);



    }
}
