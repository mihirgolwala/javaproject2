public class ShiftOp {
    public static void main(String[] args) {
        {
            System.out.println("----------------------------------------------------------------");
            System.out.println("\t\t Left Shift Operator");
            System.out.println("10<<2 " + (10 << 2));//10*(2^2)=10*4=40
            System.out.println("10<<3 " + (10 << 3));//10*2^3=10*8=80
            System.out.println("20<<2 " + (20 << 2));//20*2^2=20*4=80
            System.out.println("15<<4 " + (10 << 4));//10*2^4=10*16=160
            System.out.println("----------------------------------------------------------------");
        }

        {
            System.out.println("----------------------------------------------------------------");
            System.out.println("\t\t Right Shift Operator");
            System.out.println("10>>2 " + (10 >> 2));//10/2^2=10/4=2
            System.out.println("20>>2 " + (20 >> 2));//20/2^2=20/4=5
            System.out.println("20>>2 " + (20 >> 3));//20/2^3=20/8=2
            System.out.println("----------------------------------------------------------------");
        }
    }
}
