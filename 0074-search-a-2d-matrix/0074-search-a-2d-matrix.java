class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[0].length - 1;
            if(matrix[i][right] < target) continue;

            while(left <= right) {
                int mid = (left + right) / 2;
                int curr = matrix[i][mid];

                if(curr == target) return true;
                if(curr < target) left = mid + 1;
                else right = mid - 1;
            }
        }

        return false;
    }
}