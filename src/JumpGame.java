public class JumpGame {

    /**
     * Returns the minimum number of jumps required to reach the last index in the
     * array.
     *
     * @param nums the array of non-negative integers
     * @return the minimum number of jumps
     */
    public int jump(int[] nums) {
        int jumps = 0, currentJumpEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        return jumps;
    }

    /**
     * Returns true if you are able to reach the last index in the array, otherwise
     * false.
     *
     * @param nums the array of non-negative integers
     * @return true if you are able to reach the last index, otherwise false
     */
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxJump) {
                return false;
            }
            maxJump = Math.max(maxJump, i + nums[i]);
            if (maxJump > nums.length - 1) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums = { 2, 3, 1, 0, 4 };
        System.out.println(jumpGame.jump(nums));
    }
}
