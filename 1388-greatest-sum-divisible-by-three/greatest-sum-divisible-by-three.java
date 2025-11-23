class Solution {
    public int maxSumDivThree(int[] nums) {
        int total = 0;
        List<Integer> rem1 = new ArrayList<>();
        List<Integer> rem2 = new ArrayList<>();

        for (int n : nums) {
            total += n;
            if (n % 3 == 1) rem1.add(n);
            else if (n % 3 == 2) rem2.add(n);
        }

        Collections.sort(rem1);
        Collections.sort(rem2);

        if (total % 3 == 0) return total;

        if (total % 3 == 1) {
            int option1 = rem1.size() > 0 ? rem1.get(0) : Integer.MAX_VALUE;
            int option2 = rem2.size() > 1 ? rem2.get(0) + rem2.get(1) : Integer.MAX_VALUE;
            return total - Math.min(option1, option2);
        }

        // total % 3 == 2
        int option1 = rem2.size() > 0 ? rem2.get(0) : Integer.MAX_VALUE;
        int option2 = rem1.size() > 1 ? rem1.get(0) + rem1.get(1) : Integer.MAX_VALUE;
        return total - Math.min(option1, option2);
    }
}
