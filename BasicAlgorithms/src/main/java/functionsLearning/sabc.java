package functionsLearning;

import java.util.Scanner;

public class sabc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(suma(a,b)+" " + suma(b,c)+ " " + suma(a,c));
    }

    public static int suma(int x,int y)
    {
        int sum = 0;
        for(int i=x;i<=y;i++)
        {
            sum=sum+i;
        }
        return sum;
    }

}
