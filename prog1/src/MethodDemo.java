public class MethodDemo {
int id;
void setId(int id){
    this.id = id;
}
int getId(){
    return this.id;
}
    public static void main(String[] args) {
MethodDemo m = new MethodDemo();
m.setId(23);
        System.out.println(m.getId());
        m.setId(24);
        System.out.println(m.getId());
    }
}
