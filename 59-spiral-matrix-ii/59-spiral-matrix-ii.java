class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int i = 1;
        
        int startRow = 0;
        int endRow   = matrix.length - 1;
        
        int startCol = 0;
        int endCol   = matrix[0].length - 1;
        
        while(startRow <= endRow && startCol <= endCol) {
            for(int col = startCol; col <= endCol; col++) {
                matrix[startRow][col] = i++;
            }
            
            for(int row = startRow + 1; row <= endRow; row++) {
                matrix[row][endCol] = i++;
            }
            
            for(int col = endCol - 1; col >= startCol; col--) {
                if(startRow == endRow) break;
                matrix[endRow][col] = i++;
            }
            
            for(int row = endRow - 1; row > startRow; row--) {
                if(startCol == endCol) break;
                matrix[row][startCol] = i++;
            }
            
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        
        return matrix;
    }
}