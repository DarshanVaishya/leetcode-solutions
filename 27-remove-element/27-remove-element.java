class Solution {
    public int removeElement(int[] arr, int val) {
        int idx = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] != val) {
                idx++;
                continue;
            }

            int j = i;
            while(j < n && arr[j] == val) {
                j++;
            }

            if(j == n) {
                break;
            }

            swap(arr, idx, j);
            idx++;
        }

        return idx;
    }
    
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}