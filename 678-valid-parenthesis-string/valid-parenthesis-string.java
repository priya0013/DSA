class Solution {
    public boolean checkValidString(String s) {
        int mino=0;
        int maxo=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                mino++;
                maxo++;
            }else if(c==')'){
                mino--;
                maxo--;
            }else{
                mino--;
                maxo++;
            }
            if(maxo<0){
                return false;
            }
            mino=Math.max(mino,0);
        }
        return mino==0;
    }
}