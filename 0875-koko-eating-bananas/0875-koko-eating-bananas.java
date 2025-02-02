class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int res = high;

        while(low <= high) {
            int mid = (low + high) / 2;
            long totalTime = 0;

            for(int pile : piles) {
                totalTime += Math.ceil((double) pile / mid);
            }

            if(totalTime <= h) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }
}