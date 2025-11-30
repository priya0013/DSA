class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int num : nums) total += num;
        
        int rem = (int)(total % p);
        if (rem == 0) return 0;  // already divisible

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // base case

        long prefix = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % p;

            int need = (int)((prefix - rem + p) % p);

            if (map.containsKey(need)) {
                minLen = Math.min(minLen, i - map.get(need));
            }

            map.put((int)prefix, i);
        }

        return minLen == nums.length ? -1 : minLen;
    }
}
