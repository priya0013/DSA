class Solution {
    public int titleToNumber(String columnTitle) {
        int col=0;
        for(int i=0;i<columnTitle.length();i++){
            char c=columnTitle.charAt(i);
            col=col*26+(c-'A'+1);
        }
        return col;
    }
}