package functionsLearning;

import java.util.Scanner;

public class invertedcolor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();


        System.out.println(reverseR(R)+" "+reverseB(G)+" " + reverseG(B));
    }
    public static int reverseR(int R)
    {
        int r = 255;
        R=r-R;
        return R;
    }
    public static int reverseG(int G)
    {
        int g = 255;
        G=g-G;
        return G;
    }
    public static int reverseB(int B)
    {
        int b = 255;
        B=b-B;
        return B;
    }


}
