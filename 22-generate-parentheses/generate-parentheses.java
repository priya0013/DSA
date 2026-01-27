import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String currentString, int openCount, int closeCount, int maxPairs) {
        if (currentString.length() == maxPairs * 2) {
            result.add(currentString);
            return;
        }
        if (openCount < maxPairs) {
            backtrack(result, currentString + "(", openCount + 1, closeCount, maxPairs);
        }
        if (closeCount < openCount) {
            backtrack(result, currentString + ")", openCount, closeCount + 1, maxPairs);
        }
    }
}
