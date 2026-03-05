class Solution {
    public String triangleType(int[] nums) {
        int t = 0;
        String str;
        if (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]) {
            t = 1;
        }
        if(nums[0] == nums[1] && nums[1] == nums[2])
        {
            str = "equilateral";
        }
        else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] ==nums[2])
        {
            str = "isosceles";
        }
        else{
            str = "scalene";
        }
        if(t != 1){
            str = "none";
        }
        return str;
    }
}
