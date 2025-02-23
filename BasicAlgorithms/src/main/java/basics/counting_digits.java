package basics;

import java.util.Scanner;

public class counting_digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vf = new int[11];
        int temp = n;


        do {
            vf[temp % 10]++;
            temp = temp / 10;
        } while (temp > 0);

        for (int i = 0; i < 10; i++) {
            if(vf[i]!=0){
                System.out.println("Digit "+ i + " occurs "+ vf[i]+" times.");
            }
        }


    }
}
