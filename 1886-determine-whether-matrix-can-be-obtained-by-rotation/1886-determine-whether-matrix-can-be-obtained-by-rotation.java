class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // On 4th rotation the matrix will be same as start
        for(int i = 0; i < 4; i++) {
            if(Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotateMatrix(mat);
        }
        
        return false;
    }
    
    public int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] res = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                res[j][n - i - 1] = matrix[i][j];
            }
        }
        
        return res;
    }
}