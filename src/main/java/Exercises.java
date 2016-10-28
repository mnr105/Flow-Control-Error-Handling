import com.sun.org.apache.xpath.internal.SourceTreeManager;
import org.omg.IOP.TAG_JAVA_CODEBASE;
import org.omg.SendingContext.RunTime;
import org.w3c.dom.ranges.Range;

import java.util.IdentityHashMap;

/**
 * Created by lluca on 27-Oct-16.
 */
public class Exercises {

    ///////////////////1//////////////////////
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if ((aSmile == true) && (bSmile == true) || (aSmile == false) && (bSmile == false)) {
            System.out.println("We have problems");
            return true;
        } else if ((aSmile == true) && (bSmile == false) || (aSmile == false) && (bSmile == true)) {
            System.out.println("we dont have problems");
            return false;
        }

        return true;
    }

    //////////////////2///////////////////////
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((hour <= 7) || (hour > 20))
            talking = false;
        else
            talking = true;
        return talking;
    }

    ////////////////3////////////////////////
    public boolean posNeg(int a, int b, boolean negative) {
        if (a < 0 && b < 0) {
            negative = true;
            return negative;
        } else if ((a < 0) || b < 0)
            return true;
        return false;
    }

    /////////////////4//////////////////////
    public String backAround(String str) {
        int index = str.length();
        StringBuilder myString = new StringBuilder();
        StringBuilder fistString = new StringBuilder(str);
        char a = fistString.charAt(index - 1);
        myString.append(a);
        myString.append(fistString);
        // System.out.println(myString.length());
        return myString.toString();
    }

    //ParAnoRmaL
    /////////////////5//////////////////////
    public String everyNth(String str, int n) {
        int nr = n;
        StringBuilder myString = new StringBuilder();
        StringBuilder ThaString = new StringBuilder(str);
        // System.out.println(ThaString.length());
        myString.append(ThaString.charAt(0));
        while (n <= str.length() - 1) {
            //System.out.println(n);
            char a = ThaString.charAt(n);
            myString.append(a);
            n = (n + nr);
        }
        return myString.toString();
    }

    ////////////////////6///////////////
    public boolean scoresIncreasing(int[] scores) {
        boolean rez = false;
        //System.out.println(scores.length);
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] <= scores[i + 1])
                rez = true;
            else
                rez = false;
        }
        return rez;
    }

    ////////////////////7///////////////
    public int sumHeights(int[] heights, int start, int end) {
        int x = 0;
        int a = heights.length;
        //System.out.println(heights.length);
        if ((start > a) || (end > a))
            System.out.println("Invalid START and END number");
        else {
            for (int i = start; i <= end - 1; i++) {
                if (heights[i] != heights[i + 1]) {
                    x = (x + (max(heights[i], heights[i + 1])));
                } else break;
            }
        }
        return x;
    }

    public int max(int a, int b) {
        // System.out.println(a + "si" + b);
        int dif = 0;
        if (a < b)
            dif = b - a;
        else
            dif = a - b;

        return dif;
    }

    public void throwMeth(int a) throws Exception {
        if (a < 2) throw new Exception("Numar prea mic");
    }

}
