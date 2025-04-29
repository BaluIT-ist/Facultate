package functionsLearning;
import java.util.Scanner;

public class ariepoligonregulat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        double arie = Arie(n, l);
        System.out.println(arie);

        arie = Math.floor(arie * 100) / 100.0;
        System.out.printf(java.util.Locale.US, "%.2f", arie);
    }

    public static double Arie(int n, int l) {
        return ((n * l * l) / 4.0) * (1.0 / Math.tan(Math.PI / n));
    }
}
