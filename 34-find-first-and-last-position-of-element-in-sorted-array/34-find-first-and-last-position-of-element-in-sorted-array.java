class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        
        res[0] = binarySearch(nums, target, true);
        if(res[0] != -1) {
            res[1] = binarySearch(nums, target, false);
        }
        
        return res;
    }
    
    public int binarySearch(int[] nums, int target, boolean findStartIndex) {
        int res = -1;
        int start = 0;
        int end   = nums.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(target == nums[mid]) {
                res = mid;
                if(findStartIndex)
                    end = mid - 1;
                else start = mid + 1;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return res;
    }
}