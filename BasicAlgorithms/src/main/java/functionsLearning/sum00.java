package functionsLearning;

import java.util.Scanner;

public class sum00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();


        System.out.println(add(a,b));

        }


    public static int add(int a,int b){
        int c = a + b ;
        return c;
    }
}
