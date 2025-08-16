class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<=1 && needle.length()<=1)return 0;
        return haystack.indexOf(needle);
    }
}