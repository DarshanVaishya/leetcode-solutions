class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] res = new int[arr.length];
        int hottest = 0;

        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] >= hottest) {
                hottest = arr[i];
                continue;
            }

            int days = 1;
            while(arr[i + days] <= arr[i]) {
                days += res[i + days];
            }
            res[i] = days;
        }

        return res;
    }
}