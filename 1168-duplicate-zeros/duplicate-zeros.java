class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) 
                zeros++;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (zeros+i <n) {
                arr[ zeros+i] = arr[i]; 
            }

            if (arr[i] == 0) {
                zeros--;
                if (zeros+i < n) {
                    arr[zeros+i] = 0;
                }
            }
        }
    }
}
