import java.util.Scanner;


public class summaxmin {
    public static void main(String[] args) {

        Scanner citesc = new Scanner(System.in);
        int n = citesc.nextInt();
        int x=citesc.nextInt();
        int Min=x;
        int Max=x;


        for(int i=0;i<n-1;i++)
        {
            x = citesc.nextInt();
            if(x<Min)
            {
                Min=x;
            }
            if(x>Max)
            {
                Max=x;
            }
        }

        int S=Min+Max;
        System.out.println(S);

    }

}
