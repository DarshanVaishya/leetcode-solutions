class Solution {
    public int maxProfit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < minPrice) minPrice = arr[i];
            else if(arr[i] - minPrice > maxprofit)
                maxprofit = arr[i] - minPrice;
        }

        return maxprofit;
    }
}