class Solution {
    public int countPartitions(int[] nums, int k) {
        int n = nums.length;
        int MOD = 1_000_000_007;

        long[] dp = new long[n + 1];
        long[] pref = new long[n + 1];

        dp[0] = 1;
        pref[0] = 1;

        Deque<Integer> minQ = new ArrayDeque<>();
        Deque<Integer> maxQ = new ArrayDeque<>();

        int left = 0;

        for (int i = 0; i < n; i++) {

            // Maintain min deque (increasing)
            while (!minQ.isEmpty() && nums[minQ.peekLast()] > nums[i])
                minQ.pollLast();
            minQ.addLast(i);

            // Maintain max deque (decreasing)
            while (!maxQ.isEmpty() && nums[maxQ.peekLast()] < nums[i])
                maxQ.pollLast();
            maxQ.addLast(i);

            // Shrink window until max-min <= k
            while (!minQ.isEmpty() && !maxQ.isEmpty() &&
                    nums[maxQ.peekFirst()] - nums[minQ.peekFirst()] > k) {

                if (minQ.peekFirst() == left) minQ.pollFirst();
                if (maxQ.peekFirst() == left) maxQ.pollFirst();
                left++;
            }

            // dp[i+1] = sum(dp[left..i])
            long sum = pref[i] - (left > 0 ? pref[left - 1] : 0);
            if (sum < 0) sum += MOD;

            dp[i + 1] = sum % MOD;

            // Update prefix sum
            pref[i + 1] = (pref[i] + dp[i + 1]) % MOD;
        }

        return (int) dp[n];
    }
}
