package interclassingVectors;

import java.io.*;
import java.util.Scanner;

public class interclasare1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("interclasare1.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("interclasare1.out")));

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0,repeat=0;
        while (i < n && j<m) {
            if (a[i] == b[j]) {
                repeat++;
                c[k++] = a[i++];
                j++;
            } else if (a[i] < b[j]) {
                c[k++] = a[i++];

            } else c[k++] = b[j++];

        }
        while(i<n) c[k++] = a[i++];
        while(j<m) c[k++] = b[j++];

        for(i=0;i<c.length-repeat;i++){
            pw.print(c[i]+ " ");
            if((i+1)% 10 == 0) pw.println();
        }

        sc.close();
        pw.close();

    }
}
