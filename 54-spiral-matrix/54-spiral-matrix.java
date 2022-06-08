class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int startRow = 0;
        int endRow   = matrix.length - 1;
        
        int startCol = 0;
        int endCol   = matrix[0].length - 1;
        
        while(startRow <= endRow && startCol <= endCol) {
            for(int col = startCol; col <= endCol; col++) {
                res.add(matrix[startRow][col]);
            }
            
            for(int row = startRow + 1; row <= endRow; row++) {
                res.add(matrix[row][endCol]);
            }
            
            for(int col = endCol - 1; col >= startCol; col--) {
                if(startRow == endRow) break;
                res.add(matrix[endRow][col]);
            }
            
            for(int row = endRow - 1; row > startRow; row--) {
                if(startCol == endCol) break;
                res.add(matrix[row][startCol]);
            }
            
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        
        return res;
    }
}