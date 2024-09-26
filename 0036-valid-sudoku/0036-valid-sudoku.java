class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> visited = new HashSet<>();

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                char val = board[row][col];
                if(val == '.') continue;

                String rowCheck = String.format("{%d}({%c})", row, val);  
                String colCheck = String.format("({%c}){%d}", val, col);  
                String boxCheck = String.format("{%d}({%c}){%d}", row/3, val, col/3);  

                if(visited.contains(rowCheck) || visited.contains(colCheck) || visited.contains(boxCheck))
                    return false;

                visited.add(rowCheck);
                visited.add(colCheck);
                visited.add(boxCheck);
            }
        }

        return true;
    }
}