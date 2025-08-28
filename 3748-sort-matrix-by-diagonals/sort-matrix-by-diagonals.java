class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> dia=new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int d = i-j;
                dia.putIfAbsent(d, new ArrayList<>());
                dia.get(d).add(grid[i][j]);
            }
        }
        for (int d : dia.keySet()) {
            if (d >= 0) {
                Collections.sort(dia.get(d), Collections.reverseOrder());
            } else {
                Collections.sort(dia.get(d));
            }
        }
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int d = i - j;
                List<Integer> list = dia.get(d);
                ans[i][j] = list.remove(0);
            }
        }
        
        return ans;
    }
}