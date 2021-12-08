// https://leetcode.com/problems/set-matrix-zeroes/
class SetZeroes {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean rowMetric = false;
        for (int i = 0; i < cols; i++) {
            if (matrix[0][i] == 0) {
                rowMetric = true;
                break;
            }
        }
        boolean colMetric = false;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                colMetric = true;
                break;
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }
        for (int i = rows - 1; i > 0; i--) {
            for (int j = cols - 1; j > 0; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (rowMetric) {
            for (int i = 0; i < cols; i++) {
                matrix[0][i] = 0;
            }
        }
        if (colMetric) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}