/**
 * Here are some mystery methods for you to figure out!
 * 
 * @author David 
 * @version 4/24/17
 */
public class MysteryMethods
{
    public static int mystery1(int x, int y) {
        if (y == 1) {
            return x;
        }
        return x + mystery1(x, y-1);
    }

    public static int mystery2(int i, int j) { // assumes i >= 0
        if (i == 0) {
            return j;
        }
        else {
            return mystery2(i-1, j+1);
        }
    }

    public static int mystery3(int[] list, int pos) {
        if (pos == list.length-1) {
            return list[pos];
        }
        else {
            int rest = mystery3(list, pos+1);
            if (list[pos] < rest) {
                return list[pos];
            }
            else {
                return rest;
            }
        }
    }

    public static double mystery4(double a, double b) {
        if (b < 0) {
            return mystery4(1 / a, -b);
        }
        else if (b == 0) {
            return 1;
        }
        else if (b == 1) {
            return a;
        }
        
        if (b % 2 == 0) {
            return mystery4(a, b/2) * mystery4(a, b/2);
        }
        else {
            return a * mystery4(a, (b-1)/2) * mystery4(a, (b-1)/2);
        }
    }    
}
