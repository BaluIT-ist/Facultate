package recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class b16_rec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        BigInteger bi = new BigInteger(sc.next());
        System.out.println(base16(String.valueOf(bi),sb));
    }

    public static StringBuilder base16(String x,StringBuilder sb) {
        StringBuilder f;
        BigInteger xInt = BigInteger.valueOf(Long.valueOf(x));
        long longValueofxInt =xInt.longValue();
        
            if(longValueofxInt==0){
            return new StringBuilder("0");

          }
            else if (longValueofxInt %16==0){
                sb.insert(0, "0");
            }
            else if (longValueofxInt %16==1){
                sb.insert(0, "1");
            }
            else if (longValueofxInt%16==2){
                sb.insert(0, "2");
            }
            else if (longValueofxInt%16==3){
                sb.insert(0, "3");
            }
            else if (longValueofxInt%16==4){
                sb.insert(0, "4");
            }
            else if (longValueofxInt%16==5){
                sb.insert(0, "5");
            }
            else if (longValueofxInt%16==6){
                sb.insert(0, "6");
            }
            else if (longValueofxInt%16==7){
                sb.insert(0, "7");
            }
            else if (longValueofxInt%16==8){
                sb.insert(0, "8");
            }
            else if (longValueofxInt%16==9){
                sb.insert(0, "9");
            }
            else if (longValueofxInt%16==10){
                sb.insert(0, "A");
            }
             else if(longValueofxInt%16==11){
                sb.insert(0, "B");
            }
            else if(longValueofxInt%16==12){
                sb.insert(0, "C");
            }
            else if(longValueofxInt%16==13){
                sb.insert(0, "D");
            }
            else if(longValueofxInt%16==14){
                sb.insert(0, "E");
            }
            else if(longValueofxInt%16==15){
                sb.insert(0, "F");
            }

            long xNou=longValueofxInt/16;
            String xNouString =Integer.toString((int) xNou);
            f=base16(xNouString,sb);

            return sb;



    }

}
