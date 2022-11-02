import java.util.*;
/**
 * These methods have bugs that you need to fix!
 * 
 * @author David 
 * @version 3/24/18
 */
public class RecursionBugs
{
    /**
     * This method prints every other number from n down to 0.
     */
    public static void skipPrint(int n) {
        if (n <= 0) {
            System.out.println(0);
        }
        else {
            System.out.println(n);
            skipPrint(n-2);
        }
    }

    /**
     * This method performs linear search recursively. If the key is 
     * found at the head of the unexplored sublist, then you're done.
     * Otherwise, search for the key in the remaining unexplored sublist.
     * 
     * @param list  a list of integers
     * @param key   a search key
     * @param head  starting index of the unexplored sublist
     * @return position in which the key is found, or -1 if not found.
     */
    public static int linearSearch(int[] list, int key) {
        return linearSearch(list, key, 0);
    }

    private static int linearSearch(int[] list, int key, int head) {
        if (key == list[head]) {
            return head;
        }
        if (head == list.length - 1) {
            return -1;
        }
        return linearSearch(list, key, head+1);
    }
    
    /**
     * This method returns a list that contains only the even numbers from
     * the input list.
     * @param nums  a list of integers
     * @return a (possibly empty) list containing even integers
     */
    public static List<Integer> evens(List<Integer> nums) {
        if (nums.size() == 0) {
            return nums;
        } else {
            int firstItem = nums.remove(0);
            if (firstItem % 2 != 0) {
                nums = evens(nums);
            } else {
                nums = evens(nums);
                nums.add(0, firstItem);
            }
            return nums;
        }
    }        
    
    
}
