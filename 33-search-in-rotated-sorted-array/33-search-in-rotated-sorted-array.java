class Solution {
    public int search(int[] arr, int target) {
        int start = 0;
        int end  = arr.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int num = arr[mid];
            
            // Check whether arr[mid] and target are in the same half or not
            // This condition is shorter version of
            // ((target < arr[0] && arr[mid] < arr[0]) || (target >= arr[0] && arr[mid] >= arr[0]))
            if(!(target < arr[0]) == (arr[mid] < arr[0])) {
                num = target < arr[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            if(num == target) {
                return mid;
            }
            
            if(num < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1;
    }
}