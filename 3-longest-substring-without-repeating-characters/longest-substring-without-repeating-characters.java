class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int mx=0;
        int arr[]=new int[128];
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(arr[c]>l){
                l=arr[c];
            }
            arr[c]=r+1;
            mx=Math.max(mx,r-l+1);
        }
        return mx;
    }
}