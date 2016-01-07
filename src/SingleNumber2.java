import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by aramponi032414 on 15/12/2015.
 */
public class SingleNumber2 {
    public static int singleNumber(int[] nums) {
        // we assume nums is filled
        int xors = 0;
        for (int num:nums) {
            xors ^= num;
        }
        return xors;
    }

    public static int[] singleNumber_bis(int[] nums) {
        // naive impl
        HashSet<Integer> souvenir = new HashSet<>(nums.length/2);
        for (int num:nums) {
            if (!souvenir.contains(num)) {
                souvenir.add(num);
            } else {
                souvenir.remove(num);
            }
        }
        Iterator<Integer> iterator = souvenir.iterator();
        return new int[]{iterator.next(), iterator.next()};
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
//        for (int i = 0; i < 100000; i++)
//            singleNumber(new int[] {1,2,3,4,5,6,7,8,9,1,2,3,5,6,7,8,9});
        System.out.println(Arrays.toString(singleNumber_bis(new int[]{1, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 5, 6, 7, 8, 9})) + "=4");
        System.out.println(System.nanoTime() - start);
    }
}
