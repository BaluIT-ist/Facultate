package arraysApplications;

import java.util.Scanner;

public class inseraredupa {
    public static void main(String[] args) {

        Scanner citeste=new Scanner(System.in);
        int[] v=new int[100];
        int n=citeste.nextInt();


        for(int i=0;i<n;i++)
        {
            v[i]=citeste.nextInt();
        }

        for(int pos=0;pos<n;pos++)
        {
           if(v[pos]%2==0)
           {
               for(int i=n-1;i>=pos;i--)
               {
                   v[i+1]=v[i];
               }
               n++;
               v[pos+1]=v[pos]*2;
               pos++;
           }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(v[i]+" ");
        }

    }
}
