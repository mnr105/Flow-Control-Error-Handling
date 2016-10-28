

/**
 * Created by lluca on 28-Oct-16.
 */
public class OverflowException extends Exception {

    public OverflowException() {
        System.out.println("the sum of the two Integers exceeds Integer.MAX_VALUE\n");
    }
}
