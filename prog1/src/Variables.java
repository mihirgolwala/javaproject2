public class Variables {
    int id;// instance/object var
    static double a = 90;//static

    public static void main(String[] args) {
        int a = 100;//local
        System.out.println(a);
        System.out.println(Variables.a);

        Variables variables = new Variables();
        System.out.println(variables.id + 1);

    }
}
