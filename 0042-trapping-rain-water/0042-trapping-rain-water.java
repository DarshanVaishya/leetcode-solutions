class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n == 0) return 0;

        int left = 0;
        int maxLeft = height[left];
        int right = n - 1;
        int maxRight = height[right];
        int totalWater = 0;

        while(left < right) {
            if(maxLeft <= maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                totalWater += maxLeft - height[left];
            }
            else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                totalWater += maxRight - height[right];
            }
        }

        return totalWater;
    }
}