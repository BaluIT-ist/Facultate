package arraysApplications;

import java.util.Scanner;

public class inserare {
    public static void main(String[] args) {

        Scanner citesc=new Scanner(System.in);
        int[] v = new int[27];
        int n = citesc.nextInt();
        int X = citesc.nextInt();
        int p = citesc.nextInt();

        for(int i=1;i<=n;i++)
        {
            v[i]= citesc.nextInt();
        }
        for(int i=n;i>=p;i--)
        {
            v[i+1]=v[i];
        }
        v[p]=X;
        n++;
        for(int i=1;i<n;i++)
        {
            System.out.print(v[i]+" ");
        }

        System.out.print(v[n]);


    }
}
