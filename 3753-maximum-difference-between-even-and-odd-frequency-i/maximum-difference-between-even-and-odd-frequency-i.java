class Solution {
    public int maxDifference(String s) {
        int odd[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            odd[c-'a']++;
        }
        int mx1=0;
        int mx2=Integer.MAX_VALUE;
        for(int x:odd){
            if(x==0){
                continue;
            }
            if(x%2==0){
                mx1=Math.min(x, mx1 == 0 ? x : mx1);
            }else{
                mx2=Math.max(x, mx2 == Integer.MAX_VALUE ? 0 : mx2);
            }

        }
        return mx2-mx1;

    }
}