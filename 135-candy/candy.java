class Solution {
    public int candy(int[] r) {
        int n=r.length;
        int l[] =new int[n];
        int h[]=new int[n];
        Arrays.fill(l,1);
        Arrays.fill(h,1);
        for(int i=1;i<n;i++){
            if(r[i]>r[i-1]){
                l[i]=l[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(r[i]>r[i+1]){
                h[i]=h[i+1]+1;
                h[i]=Math.max(l[i],h[i]);
            }
        }
        int sum=0;
        for(int c=0;c<n;c++){
            sum+=Math.max(l[c],h[c]);
        }
        return sum;

    }
}