package recursion;

import java.util.Scanner;

public class factorialRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n =sc.nextInt();

        System.out.println(func(n));


    }
    public static double func(double x){
        double f;
                if(x==0)
                {
                    return 1;
                }
                else
                    f=func(x-1)*x;
                return f;
    }
}
