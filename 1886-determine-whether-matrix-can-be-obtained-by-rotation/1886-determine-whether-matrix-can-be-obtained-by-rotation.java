class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int count = 0;
        
        while(count < 4) {
            if(Arrays.deepEquals(target, mat)) {
                return true;
            }
            
            mat = rotateMatrix(mat);
            count++;
        }
        
        return false;
    }
    
    public int[][] rotateMatrix(int[][] matrix) {
        int m = matrix.length;
        int[][] res = new int[m][m];
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                res[j][m - i - 1] = matrix[i][j];
            }
        }
        
        return res;
    }
}