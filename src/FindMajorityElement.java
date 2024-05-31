import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {

    /**
     * Finds the majority element in an array using Moore Voting algorithm.
     *
     * @param nums the array
     * @return the majority element
     */
    static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    static int majorityElementUsingHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElementUsingHashMap(nums);
        System.out.println(result);
    }
}
