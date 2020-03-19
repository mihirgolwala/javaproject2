class demo{
  private int a = 19;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
public class modifier {
    public static void main(String[] args) {
        demo d = new demo();
        d.setA(25);
        System.out.println(d.getA());
    }
}
