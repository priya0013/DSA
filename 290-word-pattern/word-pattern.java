class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []str=s.split(" ");
        if(str.length != pattern.length()){
            return false;
        }
        Map ix=new HashMap();
        for(Integer i=0;i<str.length;i++){
            if(ix.put(pattern.charAt(i),i)!=ix.put(str[i],i)){
                return false;
            }
        }
        return true;
    }
}