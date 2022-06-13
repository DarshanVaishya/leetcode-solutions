class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int res = end + 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target)
                return mid;

            if(target < nums[mid]) {
                end = mid - 1;
                res = mid;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }
}