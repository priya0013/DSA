class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] suffixZeros = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0) {
                    count++;
                } else {
                    break;
                }
            }
            suffixZeros[i] = count;
        }
        
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int neededZeros = n - 1 - i;
            int targetRow = -1;
            
            for (int j = i; j < n; j++) {
                if (suffixZeros[j] >= neededZeros) {
                    targetRow = j;
                    break;
                }
            }
            
            if (targetRow == -1) return -1; 
            
            for (int k = targetRow; k > i; k--) {
                int temp = suffixZeros[k];
                suffixZeros[k] = suffixZeros[k - 1];
                suffixZeros[k - 1] = temp;
                swaps++;
            }
        }
        
        return swaps;
    }
}
