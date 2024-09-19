class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] products = new int[n];

        int leftProd = 1;
        for(int i = 0; i < n; i++) {
            products[i] = leftProd;
            leftProd *= nums[i];
        }

        int rightProd = 1;
        for(int i = n - 1; i >= 0; i--) {
            products[i] *= rightProd;
            rightProd *= nums[i];
        }

        return products;
    }
}