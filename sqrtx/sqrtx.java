class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end   = x;
        int res   = 0;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int target = x / mid;
            
            if(mid == target) {
                return mid;
            }
            else if(mid < target) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return res;
    }
}