package functionsLearning;

import java.util.Scanner;

public class problem1260 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(sum(a,b)+ " ");
        System.out.print(diff(a,b)+ " ");
        System.out.print(multiplication(a,b)+ " ");
        System.out.print(division(a,b));
    }
    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
    public static int diff(int a,int b){
        int c = a - b;
        return c;
    }

    public static int multiplication(int a,int b){
        int c = a*b;
        return c;
    }

    public static int division(int a,int b){
        int c = a/b;
        return c;
    }
}

