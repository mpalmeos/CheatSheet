/**
 * Created by Maie on 01/10/2016.
 */
public class IfStatements {

    public static void main(String[] args) {

        int x = 20;
        int y = 20;

        if (x < y){
            System.out.println("X is less than Y");
        }

        if (x == y) {
            System.out.println("X is equal to Y");
        }

        if (x > y) {
            System.out.println("X is more than Y");
        } /**
         All this is inefficient, since the computer
         has to run all three statements, before we get an answer.
         */

        if (x < y) {
            System.out.println("X is less than Y");
        }else if (x == y){
            System.out.println("X is equal to Y");
        }else if (x > y){
            System.out.println("X is greater than Y");
        } /**
         More efficient, because we get an answer when the
         computer gets to the first condition that fits.
         */

        /** Semi-colon will end a complete statement.
         * Curly brace needs to begin AND end.
         */
    }

}
