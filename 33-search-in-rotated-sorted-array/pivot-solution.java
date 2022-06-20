class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        int pivot = findPeak(nums);

        // if pivot is -1 then there is no rotation
        if(pivot == -1) {
            return binarySearch(nums, target, 0, n);
        }

        if(nums[pivot] == target) {
            return pivot;
        }

        if(target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot);
        }

        return binarySearch(nums, target, pivot + 1, n);
    }
    
    public int findPeak(int[] nums) {
        int start = 0;
        int end   = nums.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            else if(mid > start && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }
            else if(nums[mid] < nums[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
    
    public int binarySearch(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(nums[mid] == target)
                return mid;
            
            if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1;
    }
}
