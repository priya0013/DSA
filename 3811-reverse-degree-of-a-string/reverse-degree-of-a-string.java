class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=1;i<=s.length();i++){
            int ele='z'-s.charAt(i-1)+1;
            ans+=i*ele;
        }
        return ans;
    }
}