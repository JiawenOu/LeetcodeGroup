/*
Power of Three
Given an integer, write a function to determine if it is a power of three.
Follow up:
Could you do it without using any loop / recursion?
*/

public class Solution {
    public boolean isPowerOfThree(int n) {

        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
        /*
        if (n > 1){
            while (n % 3 == 0) {
                n /= 3;
            }
        }
        return n == 1;
        */
    }
}
