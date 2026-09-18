class Solution {
    public boolean areOccurrencesEqual(String s) {
        int cnt[]=new int[26];
        int target=0;
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;
        }
        for(int x:cnt){
            if(x==0){
                continue;
            }
            if(target==0){
                target=x;
            }else if(target!=x){
                return false;
            }
        }
        return true;
    }
}