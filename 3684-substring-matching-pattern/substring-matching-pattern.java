class Solution {
    private static boolean submatch(String sub,String p){
        int start=0;
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)=='*'){
                start=i;
                break;
            }
        }
        int left_len=start;
        int right_len=p.length()-start-1;
        if(sub.length()<left_len+right_len){
            return false;
        }
        for(int i=0;i<left_len;i++){
            if(sub.charAt(i)!=p.charAt(i)){
                return false;
            }
        }
        for(int j=0;j<right_len;j++){
            if(sub.charAt(sub.length()-right_len+j)!=p.charAt(start+j+1)){
                return false;
            }
        }
        return true;
    }
    public boolean hasMatch(String s, String p) {
        for(int start=0;start<s.length();start++){
            for(int end=s.length();end>0;end--){
                String sub="";
                for(int k=start;k<end;k++){
                    sub=sub+s.charAt(k);
                }
                if(submatch(sub,p)){
                return true;
        }
    }
            
}
        
            return false;
        
    }
    

}