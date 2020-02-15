/*
Data Type	Default Value	Default size
boolean	      false	        1 bit
char	    '\u0000'	    2 byte
byte	        0	        1 byte
short	        0	        2 byte
int	            0	        4 byte
long	        0L	        8 byte
float	        0.0f	    4 byte
double	        0.0         8 byte
*/

import com.sun.org.apache.xpath.internal.objects.XString;

public class SampleVar {

    public static void main(String[] args) {
        Boolean one = true;
        boolean second = false;
        System.out.println(one + " " +second);

        //16/16 -> 10
        int a = 100000, i1 = 0x10;
        Integer b = -200000;
        System.out.println(a + " " +b);

        long a1 = 100000L;
        Long b1 = -200000L;
        System.out.println(a1 + " " +b1);

        float f1 = 234.5f;
        Float f2 = 234.5f;
        System.out.println(f1 + " " +f2);

        double d1 = 1201111111111111111.3;
        Double d2 = 12111111111111111111111.3;
        System.out.println(d1 + " " +d2);

        char letterA = '\u265e';
        Character letterB = 'B';
        System.out.println(letterA + " " +letterB);

        float rate = 9.8f;
        double amt = 1000;
        amt = (amt + rate * 10) / 10;
        System.out.println(rate + " " +amt);



        String name = "sumit more";
        int age = 10;
        char grade  = 'A';
        double per = 90.89;

        System.out.println("*******************************");
        System.out.println("* Name  : " + name + "          *");
        System.out.println("* age   : " + age + "                  *");
        System.out.println("* grade : " + grade + "                   *");
        System.out.println("* per   : " + per + "               *");
        System.out.println("*******************************");



    }
}
