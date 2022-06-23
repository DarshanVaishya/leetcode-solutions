class Solution {
    public int splitArray(int[] arr, int m) {
        int start = 0;
        int end   = 0;
        
        for(int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end   += arr[i];
        }
        
        while(start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            
            for(int i = 0; i < arr.length; i++) {
                if(sum + arr[i] <= mid) {
                    sum += arr[i];
                } else {
                    sum = arr[i];
                    pieces++;
                }
            }
            
            if(pieces <= m) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        
        return start;
    }
}