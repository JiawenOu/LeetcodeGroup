public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
   		HashMap<Integer, Integer> myTable = new HashMap();
   		int[] res = new int[2];
   	//	for (int i = 0; i < nums.length; i++) {
   	//		myTable.put(nums[i], i);
   	//	}
   		for (int i = 0; i < nums.length; i++) {
   			if (myTable.containsKey(target - nums[i])) {
   			    res[0] = i;
   				res[1] = myTable.get(target - nums[i]);
   				break;
   			}
   			myTable.put(nums[i], i);
   		}
   		return res;
    }
}
