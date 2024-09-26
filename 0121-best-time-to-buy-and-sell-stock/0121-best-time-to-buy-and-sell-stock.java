class Solution {
    public int maxProfit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < minPrice) minPrice = arr[i];
            int currProfit = arr[i] - minPrice;
            maxprofit = Math.max(maxprofit, currProfit);
        }

        return maxprofit;
    }
}