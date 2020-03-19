class comapny extends employee1{
    String office;

    public comapny(String office,int age, String name, String designation, int salary) {
        super(age,name,designation,salary);
        this.office = office;
    }
}
class city extends comapny{
    String branch;

    public city(String office ,String branch,int age, String name, String designation, int salary){
        super(office,age,name,designation,salary);
        this.branch =branch;
    }

//    public city(String office ,String branch, int age, String name, String designation ,int salary) {
//        this.branch = branch;
//        this.office = office;
//        this.age = age;
//        this.name = name;
//        this.designation = designation;
//        this.salary = salary;
//    }

    @Override
    public String toString() {
        return "city{" +
                "office='" + office + '\'' +
                ", branch='" + branch + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class inheritpract {
    public static void main(String[] args) {
        city c = new city("Syska", "surat",37,"mihir","manager",41000);
        System.out.println(c.toString());
    }

}
