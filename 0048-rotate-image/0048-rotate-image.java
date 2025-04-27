class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = newMatrix[i][j];
            }
        }
    }
}