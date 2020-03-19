public class ArrayPrac{
    public static void main(String[] args) {
        int[] a = new int[]{2,4,3,7,2};
        for (int i = 0; i < a.length; i++) {
            if(i==2){
                continue;
            }
            System.out.println(a[i]);
        }
    }
}