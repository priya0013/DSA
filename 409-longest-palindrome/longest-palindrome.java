class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int len=0;
        boolean odd=false;
        for(int n:mp.values()){
            len+=(n/2)*2;
            if(n%2==1){
                odd=true;
            }
        }
        if(odd){
            len++;
        }
        return len;

    }
}