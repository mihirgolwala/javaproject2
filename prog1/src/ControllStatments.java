public class ControllStatments {
    public static void main(String[] args) {
        int a = 10, b = 90;

        if (a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        int marks = -90;

        if(100 >= marks && marks>=80){
            System.out.println("A");
        }else if(80 > marks && marks>=50){
            System.out.println("B");
        }else if(50 > marks && marks>=35){
            System.out.println("C");
        }else if(35 > marks && marks>=0){
            System.err.println("Fail");
        }else{
            System.err.println("INVALID");
        }

        char ch = '%';
        switch (ch){
            case '+':
                System.out.println("Add : " + (a+b));
                break;
            case '-':
                System.out.println("Sub : " + (a-b));
                break;
            case '*':
                System.out.println("Mul : " + (a*b));
                break;
            case '/':
                System.out.println("Div : " + (a/b));
                break;
            default:
                System.err.println("Invalid Choice");
                break;

        }


            int salary = 49000;

            if(100000 >= salary && salary>=80000){
                System.out.println("Management Team");
            }else if(80000 > salary && salary>=50000){
                System.out.println("Finance Team");
            }else if(50000 > salary && salary>=35000){
                System.out.println("Sales And Marketing Team");
            }else if(35000 > salary && salary>=10000){
                System.out.println("Service Team");
            }else{
                System.err.println("INVALID SALARY");
            }


        }


}
