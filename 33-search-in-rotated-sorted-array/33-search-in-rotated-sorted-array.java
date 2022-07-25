class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        
        while(start <= end) {
            int mid = start +  (end - start) / 2;
            
            if(arr[mid] == target) {
                return mid;
            }
            
            // Left part is sorted
            if(arr[start] <= arr[mid]) {
                // if target is in the sorted part
                if(arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // right part is sorted
            else { 
                // if target is in the sorted part
                if(arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        return -1;
    }
}