import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[i] = 101;
                    k--;
                }
            }
        }
        Arrays.sort(nums);
        return k;
    }
}
