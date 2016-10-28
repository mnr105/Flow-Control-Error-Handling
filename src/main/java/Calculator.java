
import java.util.List;

/**
 * Created by lluca on 28-Oct-16.
 */
public class Calculator {

    public int add(int a, int b) throws OverflowException {

        a += b;
        if (a == Integer.MAX_VALUE) throw new OverflowException();
        else
            return a;
    }

    public int divide(int a, int b) throws UnderflowException {
        int c = a / b;
        if (c == Integer.MIN_VALUE) throw new UnderflowException();
        else
            return c;
    }

    // arithmetic overflow & underflow & average
    public int average(List<Integer> aceasta) throws OverflowException {
        int suma = 0;
        int media = 0;
        for (int i = 0; i < aceasta.size(); i++) {
            suma = add(suma, aceasta.get(i));
            //System.out.println(suma);
        }

        try {
            media = divide(suma, aceasta.size());
        } catch (UnderflowException e) {
            e.printStackTrace();
        }
        return media;
    }
}
