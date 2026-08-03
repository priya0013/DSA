class Solution {
    public String reverseVowels(String s) {
        String vow="aeiouAEIOU";
        int l=0;
        int r=s.length()-1;
        char a[]=s.toCharArray();
        while(l<r){
            while(l<r && vow.indexOf(a[l])==-1){
                l++;
            }
            while(l<r && vow.indexOf(a[r])==-1){
                r--;
            }
            char temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        return new String(a);
    }
}