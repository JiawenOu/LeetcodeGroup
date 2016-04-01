public class Solution {
    public int missingNumber(int[] nums) {
        
        int i;
        int res = 0;
        int sum = 0;
        int expected = 0;
        
        if (nums.length == 1) {
            res = 1 - nums[0];
        }
        else {
            for (i=0 ; i<nums.length ; i++) {
                sum += nums[i];
                expected += i;
            }
            res = expected - sum;
            if (res <= 0) {
                res = expected + nums.length - sum;
            }
        }
        return res;
    }
}