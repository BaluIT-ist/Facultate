import java.util.Scanner;

public class cifrebinare {
    public static void main(String[] args) {

        Scanner citesc=new Scanner(System.in);
        int oneCounter1=0;
        int oneCounter2=0;
        int number1= citesc.nextInt();
        int number2= citesc.nextInt();
        int num1=number1;
        int num2=number2;

       do{
           if(number1 % 2 == 1)
           {
               oneCounter1++;
           }
           number1=number1/2;

       }while(number1 != 0);

       do{
            if(number2 % 2 == 1)
            {
                oneCounter2++;
            }
            number2=number2/2;

        }while(number2 != 0);


        if(oneCounter1>oneCounter2)
        {
            System.out.println(num1);
        }
        else if(oneCounter2>oneCounter1)
        {
            System.out.println(num2);
        }
        else {
            if (num1 < num2) {
                System.out.println(num1);

            } else {
                System.out.println(num2);
            }
        }

    }
}