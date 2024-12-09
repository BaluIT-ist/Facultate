package basics;

import java.util.Scanner;

public class suma_cifrelor {
    public static void main(String[] args) {

        Scanner citesc = new Scanner(System.in);
        int number=citesc.nextInt();
        int sumofnumbers=0;


       while(number!=0)
       {
           sumofnumbers=sumofnumbers+(number%10);
           number=number/10;
       }
        System.out.println(sumofnumbers);
    }
}
