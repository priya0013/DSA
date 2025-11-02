class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for (int[] wall : walls) grid[wall[0]][wall[1]] = 1;
        for (int[] guard : guards) grid[guard[0]][guard[1]] = 2;

        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        for (int[] guard : guards) {
            int r = guard[0], c = guard[1];
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                while (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] != 1 && grid[nr][nc] != 2) {
                    if (grid[nr][nc] == 0) grid[nr][nc] = 3;
                    nr += d[0];
                    nc += d[1];
                }
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int m1 = 4, n1 = 6;
        int[][] guards1 = {{0,0},{1,1},{2,3}};
        int[][] walls1 = {{0,1},{2,2},{1,4}};
        System.out.println(sol.countUnguarded(m1, n1, guards1, walls1));

        int m2 = 3, n2 = 3;
        int[][] guards2 = {{1,1}};
        int[][] walls2 = {{0,1},{1,0},{2,1},{1,2}};
        System.out.println(sol.countUnguarded(m2, n2, guards2, walls2));
    }
}
