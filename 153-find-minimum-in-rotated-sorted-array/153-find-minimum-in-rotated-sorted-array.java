class Solution {
    public int findMin(int[] arr) {
        int start = 0;
        int end   = arr.length - 1;
        
        if(arr[start] <= arr[end]) {
            return arr[start];
        }
        
        while(start < end) {
            int mid = start + (end - start) / 2;
            
            if(arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            } else if(arr[mid - 1] > arr[mid]) {
                return arr[mid];
            }
            
            // If mid is in the second half
            // we need to go left
            if(arr[mid] < arr[0]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return -1;
    }
}