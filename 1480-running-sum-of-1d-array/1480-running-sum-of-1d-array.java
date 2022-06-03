class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = nums.clone();
            
        for(int i = 1; i < nums.length; i++) {
            ans[i] += ans[i - 1];
        }
        
        return ans;
    }
}