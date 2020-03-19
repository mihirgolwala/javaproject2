public class methodemployee {
    int id;
    String name;
    long salary;

    void setdata(int id, String name, long salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void setId(int id){
        this.id = id;
    }

    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    long getSalary(){
        return this.salary;
    }
    public static void main(String[] args) {
        methodemployee m = new methodemployee();
        m.setdata(12,"mihir", 24000);
        System.out.println(m.getId() +  m.getName() + m.getSalary());
        m.setId(27);
        System.out.println(m.getId() + '\n' + m.getName() + '\n' + m.getSalary());


    }
}
