class Solution {
    public char findTheDifference(String s, String t) {
        char res=0;
        for(char c1:s.toCharArray()){
            res^=c1;
        }
            for(char c2:t.toCharArray()){
                res^=c2;
            
        }
        return res;
    }
}