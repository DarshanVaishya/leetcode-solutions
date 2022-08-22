class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] products = new int[n];
        
        int leftRunningProd = 1;
        for(int i = 0; i < n; i++) {
            products[i] = leftRunningProd;
            leftRunningProd *= arr[i];
        }
        
        int rightRunningProd = 1;
        for(int i = n - 1; i >= 0; i--) {
            products[i] *= rightRunningProd;
            rightRunningProd *= arr[i];
        }
        
        return products;
    }
}