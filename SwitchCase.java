/**
 * Created by Maie on 02/10/2016.
 */
public class SwitchCase {
    public static void main(String[] args){
        int j = 5;
        switch(j){
            case 0:
                System.out.println("Valuse is 0");
                break;
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("No value");
                break;
            /**
             *It will find the met condition and run the code from case to break.
             * Without break, it will go on until break.
             * You can hold strings too.
             */
        }
    }
}
