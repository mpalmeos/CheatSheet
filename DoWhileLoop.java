/**
 * Created by Maie on 01/10/2016.
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int x = 10;

        do {
            System.out.println("x = " + x);
            x--;
        }while (x > 0);
        /**
         * Difference from While-loop:
         * While-loop: it first checks condition, then print;
         * do-while will print, then check.
         * I. e do-while wil ALWAYS do 1 loop!
         */
    }
}
