package basics;

import java.util.Scanner;

public class n_minim {
    public static void main(String[] args) {

        Scanner citesc = new Scanner(System.in);
        int n = citesc.nextInt();
        int x=citesc.nextInt();
        int Min=x;

        for(int i=0;i<n-1;i++)
        {
            x = citesc.nextInt();
            if(x<Min)
            {
                Min=x;
            }
        }
        System.out.println(Min);

    }

}
