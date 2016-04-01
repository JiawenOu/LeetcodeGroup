public class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int res = 0;
        int i;
        boolean flag = false;
        for (i=0; i<nums.length-1; i++) {
            if (nums[i] >= target) {
                res = i;
                flag = true;
                break;
            } 
            else if (nums[i] < target && nums[i+1] > target) {
                res = i + 1;
                flag = true;
                break;
            }
        }
        if (flag == false) {
            if (nums[nums.length-1] >= target) {
                res = nums.length - 1;
            }
            else {
                res = nums.length;
            }
        }
        return res;
    }
}