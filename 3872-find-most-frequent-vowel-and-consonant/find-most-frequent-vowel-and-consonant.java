class Solution {
    public int maxFreqSum(String s) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                freq1[c-'a']++;
            }else{
                freq2[c-'a']++;
            }
        }
            int cnt1=0;
            int cnt2=0;
            for(int x:freq1){
                cnt1=Math.max(x,cnt1);
            }
            for(int x:freq2){
                cnt2=Math.max(x,cnt2);
            }
            int ans=cnt1+cnt2;

        
            return ans;

    }
}