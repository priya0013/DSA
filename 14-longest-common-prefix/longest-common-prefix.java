class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs ==null || strs.length==0){
            return "";
        }
        String first=strs[0];
        String res="";
        for(int i=0;i<first.length();i++){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=first.charAt(i)){
                    return res;
                }
            }
            res+=first.charAt(i);
        } 
    
    return res;
    }
}