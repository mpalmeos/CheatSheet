/**
 * Created by Maie on 02/10/2016.
 */
public class AndOrStatements {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = -10;

        if(x > 0 & y > 0){
            System.out.println("Both numbs are +ve");
        }else if(x > 0 | y > 0){
            System.out.println("at least one number is +ve");
        }else{
            System.out.println("Both nums are -ve");
        }
        /**
         * If both are positive, print both are pos.
         * If one of them is pos, print at least one is pos.
         * Is none of the above, print both are neg.
         * Two && and || are needed, because if there's only one, then it will check both conditions,
         * if two, then it'll stop at the first.
         */
    }
}
