/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int res = findPeak(mountainArr);
        
        int idx = binarySearch(mountainArr, target, 0, res);
        if(idx == -1) {
            idx = binarySearch(mountainArr, target, res, mountainArr.length() - 1);
        }
        
        return idx;
    }
    
    public int findPeak(MountainArray arr) {
        int start = 0;
        int end   = arr.length() - 1;
        
        while(start < end) {
            int mid = start + (end - start) / 2;
            
            if(arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        
        return start;
    }
    
    public int binarySearch(MountainArray arr, int target, int start, int end) {
        boolean isAsc = arr.get(start) <= arr.get(end);
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int value = arr.get(mid);
            
            if(value == target)
                return mid;
            
            if(value < target) {
                if(isAsc) start = mid + 1;
                else end = mid - 1;
            } else {
                if(isAsc) end = mid - 1;
                else start = mid + 1;
            }
        }
        
        return -1;
    }
}

