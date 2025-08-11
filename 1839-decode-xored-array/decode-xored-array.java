class Solution {
    public int[] decode(int[] e, int first) {
        int a[]=new int[e.length+1];
        for(int i=1;i<=e.length;i++){
            a[0]=first;
            a[i]=e[i-1]^a[i-1];
        }
        return a;
    }
}