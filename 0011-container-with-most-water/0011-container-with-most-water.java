class Solution {
    public int maxArea(int[] arr) {
        int maxArea = 0;
        int left = 0;
        int right = arr.length - 1;
        
        while(left < right) {
            int currArea = Math.min(arr[left], arr[right]) * (right - left);
            maxArea = Math.max(currArea, maxArea);

            if(arr[left] <= arr[right]) left++;
            else right--;
        }

       return maxArea;
    }
}