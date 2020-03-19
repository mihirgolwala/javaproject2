class Parent{
    String surname = "golwala";
}
public class InheritanceDemo extends Parent{
    String name;

    public static void main(String[] args) {
        InheritanceDemo inherit = new InheritanceDemo();
        inherit.name = "Mihir";
        System.out.println(inherit.name + inherit.surname);
    }
}
