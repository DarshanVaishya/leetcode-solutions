class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int totalWater = 0;
        int i = 0;
        int j = 0;
        while(i < n) {
            while(j < n && height[i] >= height[j]) {
                totalWater += height[i] - height[j];
                j++;
            }
            i = j;
        }

        return totalWater;
    }
}