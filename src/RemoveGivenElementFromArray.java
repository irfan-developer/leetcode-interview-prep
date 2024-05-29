import java.util.Arrays;

public class RemoveGivenElementFromArray {

    /**
     * Removes all instances of a given value in an array in-place.
     *
     * @param nums the array
     * @param val  the value to remove
     * @return the new length of the array excluding the removed elements
     */
    static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int num : nums) {
            if (num != val) {
                nums[i++] = num;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 2, 3 };
        int val = 3;
        int len = removeElement(nums, val);
        System.out.println(len);
        System.out.println(Arrays.toString(nums));
    }
}
