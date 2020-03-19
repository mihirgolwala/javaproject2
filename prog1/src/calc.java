public class calc {
    float a, b;
    char operator;

    calc(float a, float b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    float add() {
        return this.a + this.b;
    }

    float sub() {
        return this.a - this.b;
    }

    float multiply() {
        return this.a * this.b;
    }

    float division() {
        return this.a / this.b;
    }

    void result() {
        switch (operator) {
            case '+':
                System.out.println(add());
                break;
            case '-':
                System.out.println(sub());
                break;
            case '*':
                System.out.println(multiply());
                break;
            case '/':
                System.out.println(division());
                break;
        }

    }

    public static void main(String[] args) {
    calc c = new calc(10 , 23,'+');
    c.result();
    }

    }
