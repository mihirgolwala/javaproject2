public class grade {
    public static void main(String[] args) {


        int maths = -8 , english = 80 , science = 89 , total;
        float avgerage;
        total = maths + english + science ;
        avgerage = total/3;

        if(100 >= avgerage && avgerage>=80){
            System.out.println("A");
        }else if(80 > avgerage && avgerage>=50){
            System.out.println("B");
        }else if(50 > avgerage && avgerage>=35){
            System.out.println("C");
        }else if(35 > avgerage && avgerage>=0){
            System.err.println("Fail");
        }else{
            System.err.println("INVALID");
        }
    }

}
