import java.util.List;

/**
 * Here are some methods for you to write
 * 
 * @author David 
 * @version 3/24/18
 */
public class Recursion
{
    /**
     * Determine the number of digits in a given integer.
     * 
     * @param n a positive integer
     * @return the number of digits in n
     */
    public static int countDigits(int n) {
        if (n >= 0) {
            return countDigitsHelper(n, 0);
        } else {
            return countDigitsHelper(-n, 0);
        }
    }
    private static int countDigitsHelper(int n, int count) {
        if (n <= 0) {
            return count;
        } else {
            count++;
            return countDigitsHelper(n / 10, count);
        }
    }

    /**
     * Determine the greatest common divisor (gcd) between m and n
     * 
     * @param m a positive integer
     * @param n a positive integer
     * @return the gcd between m and n
     */
    public static int gcd(int m, int n) {
        if (m > n) {
            if (m % n == 0) {
                return n;
            } else {
                return gcd(m % n, n);
            }
        } else {
            if (m % n == 0) {
                return m;
            } else {
                return gcd(m, n % m);
            }
        }
    }

    
    /**
     * Determines if the given list contains consecutive numbers.
     *
     * @param list a list of integers
     * @return true if the numbers are consecutive
     */
    public static boolean isConsecutive(List<Integer> list) {
        if (list.size() <= 1) {
            return true;
        } else if (list.get(0) + 1 == list.get(1)){
            return isConsecutive(list.subList(1, list.size()));
        } else {
            return false;
        }
    }
    
    /**
     * Reverses the given list.
     * @param list a list of integers
     * @param start Current start position of the list
     * @param end   Current end position of the list
     */
    public static void reverse(List<Integer> list) {
        if (list.size() > 0) {
            reverseHelper(list, 0, list.size() - 1);
        }
    }
    private static void reverseHelper(List<Integer> list, int start, int end) {
        if (start <= end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++; end--;
            reverseHelper(list, start, end);
        }
    }

    /**
     * Prime number checker
     * @param n The number to check
     * @param divisor The current number by which to divide n
     */
    public static boolean isPrime(int n) {
        return false;
    }
    private static boolean isPrimeHelper(int n, int divisor) {
        return false;
    }    
}
