class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();

        int[] stack = new int[n]; 
        int top = -1;

        boolean[] valid = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack[++top] = i;
            } else {
                if (top >= 0) {
                    int openIndex = stack[top--]; 
                    valid[i] = true;
                    valid[openIndex] = true;
                }
            }
        }

        int max = 0, count = 0;
        for (boolean v : valid) {
            if (v) count++;
            else count = 0;
            max = Math.max(max, count);
        }

        return max;
    }
}
