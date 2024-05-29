import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray2 {

    /**
     * Removes duplicates in an array in-place such that duplicates appeared at most twice and returns the new length.
     *
     * @param nums the array
     * @return the new length of the array excluding the duplicates
     */
    static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i < 2 || num > nums[i - 2]) {
                nums[i++] = num;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int result = removeDuplicates(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }
}
