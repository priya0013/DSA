class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int b : batteries) sum += b;

        long left = 0, right = sum / n; 

        while (left < right) {
            long mid = right - (right - left) / 2; 

            if (canRun(mid, batteries, n)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    private boolean canRun(long T, int[] batteries, int n) {
        long total = 0;
        for (int b : batteries) {
            total += Math.min((long)b, T);
        }
        return total >= T * n;
    }
}
