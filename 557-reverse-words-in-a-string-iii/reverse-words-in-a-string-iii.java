class Solution {
    public String reverseWords(String s) {
        StringBuilder db = new StringBuilder();
        int space = -1;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 || s.charAt(i) == ' ') {
                int end = (s.charAt(i) == ' ') ? i - 1 : i;
                for (int j = end; j > space; j--) {
                    db.append(s.charAt(j));
                }
                if (s.charAt(i) == ' ') {
                    db.append(' ');
                    space = i;
                }
            }
        }
        return db.toString();
    }
}
