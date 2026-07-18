class Solution {
    private void swap(int[][] grid , int i , int j , int corrI , int corrJ){
        int temp = grid[i][j];
        grid[i][j] = grid[corrI][corrJ];
        grid[corrI][corrJ] = temp;
    }
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        for(int i =0; i<n ; i++){
            for(int j =0; j<n ; j++){
                while (true) {
                    int value = grid[i][j];

                    int corrI = (value - 1) / n;
                    int corrJ = (value - 1) % n;

                    if (corrI == i && corrJ == j)
                        break;

                    if (grid[corrI][corrJ] == value)
                        break;

                    swap(grid, i, j, corrI, corrJ);
                }
            }
        }
        int repeated = -1;
        int missing = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int expected = i * n + j + 1;

                if (grid[i][j] != expected) {
                    repeated = grid[i][j];
                    missing = expected;
                    break;
                }
            }
        }

        return new int[]{repeated, missing};
    }
}