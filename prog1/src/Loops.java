public class Loops {
    public static void main(String[] args)
        {
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("DO While");
        do {
            System.out.println(i);
                i--;
        }while (i>0);
        System.out.println("For Loop");
        for (int j=0;j<10;j++){
            System.out.println(j);
        }
            System.out.println("nested loop");
            //int a = 1;//
            //while (a <= 5) {//
                for (int b = 1; b <= 5; b++) {
                    for (int c = 1; c<=5 ; c++){
                        if (c<=b) System.out.print(c);
                    }
                    System.out.println(" ");
                }



    }


        }


