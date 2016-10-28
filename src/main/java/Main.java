import java.util.ArrayList;
import java.util.List;

/**
 * Created by lluca on 27-Oct-16.
 */
public class Main {

    public static void main(String[] arg_s) {
        Exercises ex = new Exercises();
       /**/
        /* System.out.println("Ex 1:");

        ex.monkeyTrouble(true, true);
        ex.monkeyTrouble(false, false);
        ex.monkeyTrouble(true, false);
        ex.monkeyTrouble(false, true);
        System.out.println("\n");

        System.out.println("Ex 2:");
        boolean rez = ex.parrotTrouble(true, 19);
        if (rez == true)
            System.out.println("Parrot OK");
        else
            System.out.println("Parrot PROBLEM");
        System.out.println("\n");

        System.out.println("Ex 3:");
        boolean rez2 = ex.posNeg(-2, 1, false);
        if (rez2 == true)
            System.out.println("Cel putin un numar negativ");
        else System.out.println("Nu avem nr negative");
        System.out.println("\n");

        System.out.println("Ex 4:");
        String rez3 = ex.backAround("pisoi");
        System.out.println(rez3);
        System.out.println("\n");

        System.out.println("Ex 5:");
        String rez4 = ex.everyNth("ParAnoRmaLi", 4);
        System.out.println(rez4);
        System.out.println("\n");

        System.out.println("Ex 6:");
        int[] x = {2, 4, 6, 8};
        System.out.println(ex.scoresIncreasing(x));
        System.out.println("\n");

        System.out.println("Ex 7:");
        int[] y = {2, 7, 4, 9, 5};
        System.out.println(ex.sumHeights(y, 1, 4));
        System.out.println("\n");


        System.out.println("Ex 8: Demo pt outOfMem ca nu mai ruleaza dupa interceptarea exceptiei");
        CrunchifyGenerateOOM memoryTest = new CrunchifyGenerateOOM();
        try {
            memoryTest.generateOOM();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n");

        System.out.println("Am reapelat metoda asta pentru a demonstra ca nu se mai apeleaza in momentul in care avem OOM");
        int[] m = {2, 7, 4, 9, 5};
        System.out.println(ex.sumHeights(m, 1, 4));
        System.out.println("\n");



        System.out.println("Ex: 9");
        Calculator calc = new Calculator();
        try {
            int q = calc.add(2, 4);
        } catch (OverflowException e) {
            e.printStackTrace();
        }
        System.out.println();
        int dev;
        List<Integer> lista = new ArrayList();
        lista.add(5);
        lista.add(6);
        lista.add(4);
        lista.add(15);
        lista.add(44);
        lista.add(69);
        lista.add(10);
        lista.add(47);
        lista.add(20);
        lista.add(54);
        lista.add(50);
        try {
            dev = calc.average(lista);
            System.out.println("Media este: " + dev+"\n aceasta Exceptie cred ca poate fi o exceptie Unchecked");
        } catch (OverflowException e) {
            e.printStackTrace();
        }*/


        System.out.println("Ex: 10");
        try {
            ex.throwMeth(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Eu totusi apar in consola");
        }
        System.out.println("\n");

    }


}
