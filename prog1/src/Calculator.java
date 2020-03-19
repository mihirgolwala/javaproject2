public class Calculator {
    int num1,num2;
    char operator;

    Calculator(int num1,int num2,char operator){
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

int add(){
        return this.num1 + this.num2;
}
    int sub(){
        return this.num1 - this.num2;
    }

void task(){
        switch (operator){
            case '+':
                System.out.println(add());
         break;
            case '-':
                System.out.println(sub());
        break;
        }
}

    public static void main(String[] args) {
Calculator c = new Calculator(2,3,'+');
c.task();
    }
}
