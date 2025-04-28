package functionsLearning;

import java.util.Scanner;

public class marte3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int x = sc.nextInt(); //5
        int y = sc.nextInt(); // 3
        int n = sc.nextInt();// 100


        //an=x zile , zi = y ore
        int anul = x * y; // 15

        System.out.println(prelucrareAni(n,anul));
        System.out.println(prelucrareZile(n,anul,y));
        System.out.println(prelucrareOre(n,anul,y));

        }


    public static int prelucrareAni(int n,int anul){

       int  a = n / anul;
       return a;
    }

    public static int prelucrareZile(int n,int anul,int y){

        int  rest = n % anul;
        int z = rest/y;
        return z;
    }

    public static int prelucrareOre(int n,int anul,int y){

        int  rest = n % anul;
        int h = rest%y;
        return h;
    }

}
