class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int leftWall = 0;
        int upWall = 0;
        int rightWall = m;
        int downWall = n;

        List<Integer> list = new ArrayList<>();

        while (leftWall < rightWall && upWall < downWall) {

            // Top row
            for (int i = leftWall; i < rightWall; i++) {
                list.add(matrix[upWall][i]);
            }
            upWall++;

            // Right column
            for (int i = upWall; i < downWall; i++) {
                list.add(matrix[i][rightWall - 1]);
            }
            rightWall--;

            // Bottom row
            if (upWall < downWall) {
                for (int i = rightWall - 1; i >= leftWall; i--) {
                    list.add(matrix[downWall - 1][i]);
                }
                downWall--;
            }

            // Left column
            if (leftWall < rightWall) {
                for (int i = downWall - 1; i >= upWall; i--) {
                    list.add(matrix[i][leftWall]);
                }
                leftWall++;
            }
        }

        return list;
    }
}