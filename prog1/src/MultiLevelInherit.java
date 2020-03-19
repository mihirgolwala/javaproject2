class Person extends useradmin{
    String name;

    @Override
    public String toString() {
        return super.toString()+"\nPerson{" +
                "name='" + name + '\'' +
                "}\n";
    }

    public Person(String name, int flat, String owner, int maintenance){
        super(flat,owner,maintenance);
        this.name = name;

    }

}
class Teacher extends Person{
    float salary;

    @Override
    public String toString() {
        return super.toString()+ "Teacher{" +
                "salary=" + salary +
                "}\n";
    }

    public Teacher(String name, float salary, int flat, String owner, int maintenance) {
        super(name,flat,owner,maintenance);
        this.salary = salary;
    }
}
class Designation extends Teacher{
    String post;


    @Override
    public String toString() {
        return super.toString()+ "Designation{" +
                "post='" + post + '\'' +
                "}\n";
    }

    public Designation(String post, float salary, String name, int flat, String owner, int maintenance) {
        super(name, salary, flat,owner,maintenance);
        this.post = post;
    }

}

public class MultiLevelInherit {
    public static void main(String[] args) {
        Designation d = new Designation("SenorTeacher", 25000, "Mihir" , 502,"dipak" , 13000);

        System.out.println(d.toString());

    }
}
