/**
 * Created by lluca on 28-Oct-16.
 */
public class UnderflowException extends Exception {

    public UnderflowException() {
        System.out.println("the sum of the two Integers is lower than Integer.MIN_VALUE\n");
    }
}
