public class JavaBlocks {

    public static void main(String[] args) {
        {
            String employee = "mihir golwala";
            int code = 77;
            char grade = 'B';
            double salary = 32000.678;
            System.out.println("*******************************");
            System.out.println("* employee  : " + employee + "   *");
            System.out.println("* code      : " + code + "              *");
            System.out.println("* grade     : " + grade + "               *");
            System.out.println("* salary    : " + salary + "       *");
            System.out.println("*******************************");
        }
        {
            String employee = "sumit more";
            int code = 12;
            char grade = 'C';
            double salary = 32000.60;
            System.out.println("*******************************");
            System.out.println("* employee  : " + employee + "   *");
            System.out.println("* code      : " + code + "              *");
            System.out.println("* grade     : " + grade + "               *");
            System.out.println("* salary    : " + salary + "       *");
            System.out.println("*******************************");
        }

        {
            int marks = 100;

            System.out.println("100 - 80 " + (100 >= marks && marks >= 80));
            System.out.println("79 - 60 " + (80 > marks && marks >= 60));
            System.out.println("59 - 50 " + (59 >= marks && marks >= 50));
            System.out.println("49 - 35 " + (49 >= marks && marks >= 35));
            System.out.println("34 - 0 " + (35 > marks && marks >= 0));
            System.out.println("100> <0 " + (100 < marks || marks < 0));
        }


        {
            int salary = 250;
            System.out.println("                              ");
            System.out.println("                               ");
            System.out.println("25000<=         " + (25000 <= salary));
            System.out.println("24999 - 20000   " + (24999 >= salary && 20000 <= salary));
            System.out.println("19999 - 15000   " + (19999 >= salary && 15000 <= salary));
            System.out.println("14999 - 10000   " + (14999 >= salary && 10000 <= salary));
            System.out.println("9999  - 5000    " + (9999 >= salary && 5000 <= salary));
            System.out.println("4999  - 1000    " + (4999 >= salary && 1000 <= salary));
            System.out.println("999   >         " + (999 >= salary));
        }
    }
}

