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
    
    public static int getLength(int num) {
        int len = 0;
        
        while(num != 0) {
            num /= 10;
            len++;
        }
        
        return len;
    }
}