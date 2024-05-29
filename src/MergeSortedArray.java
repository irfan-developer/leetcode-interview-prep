import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * The MergeSortedArray class provides methods to merge two sorted arrays into one sorted array.
 */
public class MergeSortedArray {

    /**
     * Merges two sorted arrays into one sorted array.
     *
     * @param nums1 the first sorted array
     * @param m     the number of elements in nums1 (excluding the extra space)
     * @param nums2 the second sorted array
     * @param n     the number of elements in nums2
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    /**
     * Merges two sorted arrays into one sorted array using streams and sorting.
     *
     * @param nums1 the first sorted array
     * @param m     the number of elements in nums1 (excluding the extra space)
     * @param nums2 the second sorted array
     * @param n     the number of elements in nums2
     */
    static void mergeWithStreams(int[] nums1, int m, int[] nums2, int n) {
        IntStream.range(0, n).forEach(i -> nums1[m + i] = nums2[i]);
        Arrays.sort(nums1);
    }

    /**
     * Main method to test the merge method.
     *
     * @param args command line arguments
     * @throws Exception if an error occurs
     */
    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        // mergeWithStreams(nums1, 3, new int[]{2, 5, 6}, 3);
        merge(nums1, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
