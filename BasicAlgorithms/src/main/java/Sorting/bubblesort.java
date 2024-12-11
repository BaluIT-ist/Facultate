package Sorting;

import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner citesc=new Scanner(System.in);
        int[] v = new int[1001];
        int n = citesc.nextInt();
        boolean sort;

        for(int i =1 ;i<=n;i++)
        {
            v[i] = citesc.nextInt();
        }

        do{
            sort = true;
            for(int i =1;i<n;i++)
            {
                if(v[i]>v[i+1])
                {
                    int aux=v[i];
                    v[i]=v[i+1];
                    v[i+1]=aux;
                    sort = false;
                }
            }

        }while(!sort);
        for(int i =1 ; i<=n;i++)
        {
            System.out.print(v[i]+ " ");
        }
    }
}
