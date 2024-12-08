package grasshopperCODEWARS;

public class GrassHopper {
    public static char getGrade(int s1,int s2,int s3) {

        int averageScore=0;

        averageScore=(s1+s2+s3)/3;

        if(averageScore>= 90 && averageScore<=100)
        {
            return 'A';

        }
        else if(averageScore>=80 && averageScore <90)
        {
            return 'B';
        }
        else if(averageScore>=70 && averageScore <80)
        {
            return 'C';
        }
        else if(averageScore>=60 && averageScore <70)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }

    }
}
