class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        int[] minLR = new int[n];


        int currMax = 0;
        for(int i = 0; i < n; i++) {
            maxLeft[i] = currMax;
            if(height[i] > currMax) currMax = height[i];
        }

        currMax = 0;
        for(int i = n - 1; i >= 0; i--) {
            maxRight[i] = currMax;
            if(height[i] > currMax) currMax = height[i];
        }

        for(int i = 0; i < n; i++) {
            minLR[i] = Math.min(maxLeft[i], maxRight[i]);
        }

        int water = 0;
        for(int i = 0; i < n; i++) {
            int curr = minLR[i] - height[i];
            if(curr > 0) water += curr;
        }

        return water;
    }
}