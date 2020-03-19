class employee1{
    int age;
    String name;
    String designation;
    int salary;

    public employee1(employee1 x){
        this.age = x.age;
        this.name = x.name;
        this.designation = x.designation;
        this.salary = x.salary;
    }
//public employee1(){}
    @Override
    public String toString() {
        return "employee1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void insertData(int age, String name, String designation, int salary){
        this.age = age;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public employee1(int age, String name, String designation, int salary) {
        this.age = age;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
}

public class objectpract {
    public static void main(String[] args) {
        employee1 e = new employee1( 34 , "mihir" ,  "Manager" ,  37000 );
        employee1 f = new employee1(e);
//        employee1 g = new employee1();
//        g.insertData(24,"Manthan","Admin",40000);
        System.out.println(e.toString());
        System.out.println(f.toString());
//        System.out.println(g.toString());
    }
}
