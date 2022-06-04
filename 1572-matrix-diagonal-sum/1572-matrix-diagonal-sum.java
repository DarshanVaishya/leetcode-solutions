class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            int[] row = mat[i];
            
            sum += row[i];
            if(i == n - i - 1) continue;
            sum += row[n - i - 1];
        }
        
        return sum;
    }
}