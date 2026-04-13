class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length;
        int COL = matrix[0].length;

        int l = 0, r = ROW * COL - 1; // 1D indexes (l -> r) 

        while(l <= r) {
            int mid = l + (r-l)/2;
            int row = mid / COL, col = mid % COL;

            if(target > matrix[row][col]) {
                l = mid + 1;
            }
            else if (target < matrix[row][col]) {
                r = mid - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
