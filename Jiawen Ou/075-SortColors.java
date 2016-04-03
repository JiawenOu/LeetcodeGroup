public class Solution {
    public void sortColors(int[] nums) {
        
        HashMap<Integer, Integer> myTable = new HashMap();
        int red=0,white=0,blue=0;
        for (int i = 0; i < nums.length; i++) {
   			if (myTable.containsKey(nums[i])) {
                myTable.put(nums[i], myTable.get(nums[i])+1);
   			}
   			else {
   			    myTable.put(nums[i], 1);
   			}
        }
        if(myTable.containsKey(0)){
            red   = myTable.get(0);
        }
        if(myTable.containsKey(1)){
            white = myTable.get(1);
        }
        if(myTable.containsKey(2)){
            blue  = myTable.get(2);
        }
        for(int i = 0; i < red; i++) {
            nums[i] = 0;
        }
        for(int i = red; i < red + white; i++) {
            nums[i] = 1;
        }
        for(int i = red + white; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}