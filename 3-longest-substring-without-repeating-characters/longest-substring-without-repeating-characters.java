class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int mx=0;
        int arr[]=new int[128];
        for(int r=0;r<s.length();r++){
            if(arr[s.charAt(r)]>l){
                l=arr[s.charAt(r)];
            }
            arr[s.charAt(r)]=r+1;
        
        mx=Math.max(mx,r-l+1);
        }
        return mx;
    }
}