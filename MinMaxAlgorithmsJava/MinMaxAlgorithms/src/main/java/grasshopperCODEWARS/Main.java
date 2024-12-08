package grasshopperCODEWARS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int s1;
        int s2;
        int s3;

        Scanner citesc = new Scanner(System.in);
        s1 = citesc.nextInt();
        s2 = citesc.nextInt();
        s3 = citesc.nextInt();

        System.out.println(GrassHopper.getGrade(s1,s2,s3));


    }
}
