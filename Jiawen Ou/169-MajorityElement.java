public class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> myTable = new HashMap();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
   			if (myTable.containsKey(nums[i])) {
                myTable.put(nums[i], myTable.get(nums[i])+1);
   			}
   			else {
   			    myTable.put(nums[i], 1);
   			}
   			if(myTable.get(nums[i]) > nums.length/2) {
   			    res = nums[i];
   			    break;
   			}
   		}
   		return res;
    }
}