class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        
        int start = 0;
        int end = n - 1;
        
        for(int i = n - 1; i >= 0; i--) {
            int idx = Math.abs(arr[start]) <= Math.abs(arr[end]) ? end-- : start++;
            int element = arr[idx];
            res[i] = element * element;
        }
        
        return res;
    }
}