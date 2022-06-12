class Solution {
    public int findNumbers(int[] nums) {
        // DOING THIS WITHOUT USING STRINGS
        int res = 0;
        
        for(int num : nums) {
            if(getLength(num) % 2 == 0) {
                res++;
            }
        }
        
        return res;
    }
    
    public int getLength(int num) {
        return (int) (Math.log10(num)) + 1;
    }
}