package functionsLearning;
import java.util.Scanner;

public class ariepoligonregulat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();
        double l = sc.nextInt();
        double arie=Arie(n,l);
        System.out.printf(java.util.Locale.US,"%.2f",arie);
    }

    public static double Arie(double n,double l){
        return ((n * l * l) / 4.0) * (1.0 / Math.tan(Math.PI / n));
    }
}
