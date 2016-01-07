import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by aramponi032414 on 15/12/2015.
 */
public class FindDuplicates {
    public static int findDuplicate(int[] nums) {
        final int length = nums.length;
        BitSet souvenir = new BitSet(length + 1);
        for (int i = 0; i < length;i ++) {
            if (souvenir.get(nums[i])) {
                return nums[i];
            }
            souvenir.set(nums[i]);
        }
        // should not happen
        return 0;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
//        for (int i = 0; i < 100000; i++)
//            singleNumber(new int[] {1,2,3,4,5,6,7,8,9,1,2,3,5,6,7,8,9});
        System.out.println(findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 4 ,10}) + "=4");
        System.out.println(System.nanoTime() - start);
    }
}
