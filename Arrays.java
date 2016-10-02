/**
 * Created by Maie on 02/10/2016.
 */
public class Arrays {
    public static void main(String[] args){

        /**
        int a = 10;
        int b = 20;
        int c, d, e;
        c = 30; d = 40; e = 50;

         * Arrays store numbers more efficiently
         */
        int[] a = {10, 20, 30, 40, 50};
        /**
         * Java will make boxes for the values and name them a[0], a[1] etc.
         */
        System.out.println(a[2] + " " + a[4]);

        /** enhanced for - it takes the first value of a and puts as temp, then second etc.
          */
        for(int temp : a){
            System.out.println(temp);
            System.out.println("--------------");
        }
        int[] x = new int[5];
        /**
         * This means that x needs 5 boxes. If there's no value, then default is 0.
         */
        x[3] = 25;
        x[0] = 12;

        for(int temp2 : x){
            System.out.println(temp2);
        }
        System.out.println("---------");
        String[] stx = new String[5];

        stx[3] = "25";
        stx[0] = "12";
        for(String temp2 : stx){
            System.out.println(temp2);
        }
    }
}
