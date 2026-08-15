class Solution {
    public int maximumLengthSubstring(String s) {
       int maxlen=0;
       for(int i=0;i<s.length();i++){
            Map<Character,Integer> mp=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                mp.put(c,mp.getOrDefault(c,0)+1);
                if(mp.get(c)>2){
                    break;
                }
                maxlen=Math.max(maxlen,j-i+1);
            }
       } 
       return maxlen;
    }
}