class Solution {
    public int stoneGameVIII(int[] s) {
        int n=s.length;
        int arr[]=new int[n];
        arr[0]=s[0];
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+s[i];
        }
        int []f=new int[n];
        f[n-1]=arr[n-1];
        for(int i=n-2;i>=1;i--){
            f[i]=Math.max(f[i+1],arr[i]-f[i+1]);
        }
        return f[1];
    }
}