import com.sun.deploy.security.SelectableSecurityManager;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[] total = new int[3];
        int[] average = new int[3];
        int[][] marks = new int[][]{
                {67,65,36},
                {98,67,23},
                {16,18,14}

        };
//        marks[0][0] = 15;
//        marks[0][1] = 17;
//        marks[0][2] = 18;
//        marks[1][0] = 87;
//        marks[1][1] = 76;
//        marks[1][2] = 56;
        for (int i = 0; i<3 ; i++ ) {
            for (int j = 0; j < 3; j++) {
                total[i] += marks[i][j];

            }
            average[i] = total[i] / 3;
            System.out.println(total[i]);
            System.out.println(average[i]);
         if(average[i]>80) {
             System.out.println("Grade A");
         }
         else if(average[i]>60){
             System.out.println("Grade B");
         }
         else if(average[i]>35){
             System.out.println("Grade C");

         }
         else{
             System.err.println("FAIL");
         }
        }

    }


}
