class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> ms = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            while(!ms.isEmpty() && arr[i] > arr[ms.peek()]) {
                int day = ms.pop();
                res[day] = i - day;
            }

            ms.push(i);
        }

        return res;
    }
}