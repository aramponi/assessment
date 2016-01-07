import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by aramponi032414 on 15/12/2015.
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        // we assume nums is filled
        int xors = 0;
        for (int num:nums) {
            xors ^= num;
        }
        return xors;
    }

    public static int singleNumber_bis(int[] nums) {
        // we assume nums is filled
        HashSet<Integer> souvenir = new HashSet<>();
        for (int num:nums) {
            if (!souvenir.contains(num)) {
                souvenir.add(num);
            } else {
                souvenir.remove(num);
            }
        }
        return souvenir.iterator().next();
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++)
            singleNumber(new int[] {1,2,3,4,5,6,7,8,9,1,2,3,5,6,7,8,9});
//        System.out.println(singleNumber(new int[] {1,2,3,4,5,6,7,8,9,1,2,3,5,6,7,8,9}) + "=4");
        System.out.println(System.nanoTime() - start);
    }
}
