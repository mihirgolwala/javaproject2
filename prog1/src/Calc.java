public class Calc {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("*************************************************");
        System.out.println("*              ---Calculator---                 *");
        System.out.println("*************************************************");
        {
            System.out.println("*              ---Addition---                   *");
            System.out.println("*************************************************");
            System.out.println("|                 Addition : " + (a+b) + "                 |");
            System.out.println("*************************************************");
        }{
            System.out.println("*              ---Subtraction---                *");
            System.out.println("*************************************************");
            System.out.println("|                 Subtraction : " + (a-b) + "             |");
            System.out.println("*************************************************");
        }

        {
            System.out.println("*              ---Multiplication---             *");
            System.out.println("*************************************************");
            System.out.println("|                 Multiplication : " + (a*b) + "          |");
            System.out.println("*************************************************");
        }
        {
            System.out.println("*              ---Division---                   *");
            System.out.println("*************************************************");
            System.out.println("|                 Division : " + (a/b) + "                  |");
            System.out.println("*************************************************");
        }
        {
            System.out.println("*              ---Modulus---                    *");
            System.out.println("*************************************************");
            System.out.println("|                 Modulus : " + (a%b) + "                   |");
            System.out.println("*************************************************");
        }
    }
}
