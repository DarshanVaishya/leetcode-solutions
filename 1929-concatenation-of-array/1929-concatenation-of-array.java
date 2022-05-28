class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int length = nums.length;

        for(int i = 0; i < length; i++) {
            ans[i] = nums[i];
            ans[length + i] = nums[i];
        }

        return ans;
    }
}