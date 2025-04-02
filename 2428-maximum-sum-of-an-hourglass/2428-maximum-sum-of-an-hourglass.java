class Solution {
    public int maxSum(int[][] grid) {
        if (grid.length < 3 || grid[0].length < 3)
            return 0;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j]
                        + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                if (sum > ans) {
                    ans = sum;
                }
            }

        }
        return ans;
    }
}