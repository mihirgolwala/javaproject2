class useradmin{
    int flat;
    String owner;
    int maintenance;

    public useradmin(useradmin x){
        this.flat = x.flat;
        this.owner = x.owner;
        this.maintenance = x.maintenance;
    }
public useradmin(){}

    @Override
    public String toString() {
        return "useradmin{" +
                " flat = " + flat +
                " , owner = " + owner +
                " , maintenance = " + maintenance +
                '}';
    }
    void notice(int flat, String owner, int maintenance){
        this.flat = flat;
        this.owner = owner;
        this.maintenance = maintenance;
    }
    public useradmin(int flat, String owner, int maintenance){
        this.flat = flat;
        this.owner = owner;
        this.maintenance = maintenance;
    }
}
public class users {
    public static void main(String[] args) {
        useradmin u = new useradmin(502,"mihir" ,12000);
        useradmin z = new useradmin(u);
        useradmin n = new useradmin();
//        employee1 y = new employee1();
        n.notice(102, "dipak" , 15000);
//        y.insertData(42, "abhi" , "president", 39000);
        System.out.println(u.toString());
        System.out.println(z.toString());
        System.out.println(n.toString());
//        System.out.println(y.toString());
    }
}
