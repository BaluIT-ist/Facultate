import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner citesc=new Scanner(System.in);
        int n=citesc.nextInt();
        int a=1,b=1,c = 0;

        for(int i=0;i<n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
           a=b;
           b=c;

        }


    }
}
