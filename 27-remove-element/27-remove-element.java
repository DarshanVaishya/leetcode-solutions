class Solution {
    public int removeElement(int[] arr, int val) {
        int idx = 0;
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] != val)
                arr[idx++] = arr[i];
        }
        
        return idx;
    }
}