class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++) {
            int start = i + 1;
            int end   = n - 1;
            int res = binarySearch(arr, target - arr[i], start, end);
            
            if(res != -1) {
                return new int[] {i + 1, res + 1};
            }
        }
        
        return new int[] {-1, -1};
    }
    
    public int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target) {
                return mid;
            }
            
            if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1;
    }
}
