package Sorting;

import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner citesc = new Scanner(System.in);
        int [] v =new int[1001];
        int n = citesc.nextInt();

        for(int i =1;i<=n;i++)
        {
            v[i]=citesc.nextInt();
        }

        for(int i =1;i<=n-1;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(v[i]>v[j])
                {
                    int aux = v[i];
                    v[i]=v[j];
                    v[j]=aux;
                }
            }
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print(v[i]+ " ");
        }
    }
}
