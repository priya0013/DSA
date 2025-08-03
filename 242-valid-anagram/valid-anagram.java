
class Solution {
    public boolean isAnagram(String s, String t) {        
        if (s.length() != t.length()) {
            return false;
        }

        int[] arrS = new int[26];
        int[] arrT = new int[26];

        for (char ch : s.toCharArray()) {
            arrS[ch - 97]++;
        }

        for (char ch : t.toCharArray()) {
            arrT[ch - 97]++;
        }

        for (int i = 0; i < arrS.length; i++) {
            if (arrS[i] != arrT[i]) {
                return false;
            }
        }
        return true;
    }
}
