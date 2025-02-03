class Solution {
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == target) return mid;

            // We are in left part
            if(arr[left] <= arr[mid]) {
                if(target > arr[mid] || target < arr[left])
                    left = mid + 1;
                else
                    right = mid - 1;
            // We are in the right part
            } else {
                if(target < arr[mid] || target > arr[right]) 
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }

        return -1;
    }
}