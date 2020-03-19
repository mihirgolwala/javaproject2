class student{
    int age;
    String name;

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        student s = new student(23,"mihir");
        System.out.println(s.toString());
    }
}
