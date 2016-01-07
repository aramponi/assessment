import java.util.BitSet;

/**
 * Created by aramponi032414 on 15/12/2015.
 */
public class FindMissing {
    public static int missingNumber(int[] nums) {
        final int length = nums.length;
        int theoriticalSum = (length ) * (1 + length) / 2;
        for (int i = 0; i < length;i ++) {
            theoriticalSum -= nums[i];
        }

        return theoriticalSum;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
//        for (int i = 0; i < 100000; i++)
//            singleNumber(new int[] {1,2,3,4,5,6,7,8,9,1,2,3,5,6,7,8,9});
        System.out.println(missingNumber(new int[]{0, 1, 2, 3, 5, 6, 7, 8, 9, 10}) + "=4");
        System.out.println(System.nanoTime() - start);
    }
}
