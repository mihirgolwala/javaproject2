package Package2;

import Package1.first;

public class second extends first {
    void setB(int b){
        setA(b);
    }
    int getB(){
        return getA();
    }
    public static void main(String[] args) {
        second s = new second();
        s.setB(67);
        System.out.println(s.getB());
    }

}
