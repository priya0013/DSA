class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        StringBuilder orig=new StringBuilder(s);
        if(s.equals(orig.reverse().toString())){
            return true;
        }
        return false;
    }
}