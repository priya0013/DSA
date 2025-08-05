class Solution {
    public int totalFruit(int[] fruits) {
         int n = fruits.length;
        int last = -1, secondLast = -1;
        int last_c = 0, currMax = 0, max = 0;

        for (int i = 0; i < n; i++) {
            int fruit = fruits[i];

            if (fruit == last || fruit == secondLast) {
                currMax++;
            } else {
                currMax = last_c + 1;
            }

            if (fruit == last) {
                last_c++;
            } else {
                last_c = 1;
                secondLast = last;
                last = fruit;
            }

            max = Math.max(max, currMax);
        }

        return max;
    }
}