public class arraypract1 {

    public static void main(String[] args) {
        int[] a = new int[]{6,4,5,6,3,9,1,2,3};
        for (int i:a) {
            i++;
            if(i==4) {
               break;
            }
            System.out.print(i);

        }
        System.out.println("");

        for (int j=0; j<a.length ;j++){
            if(a[j]<2){
                break;
            }
            System.out.println(a[j]);
        }
        }
    }

