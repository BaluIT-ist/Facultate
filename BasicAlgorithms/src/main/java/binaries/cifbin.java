package binaries;

import java.util.Scanner;

public class cifbin {
    public static void main(String[] args) {

        Scanner citesc = new Scanner(System.in);
        long n;
        n = citesc.nextInt();
        int Z=0,U=0;
    if(n>1&&n<1000000000)
    {
        do {
            if(n % 2 == 0)
            {
                Z++;
            }
            else
            {
                U++;
            }
            n=n/2;


        } while(n>0);

        System.out.print(Z+" "+U);
    }


    }
}
