class Solution {
    private int gcd(int a,int b){
        if(a==0 || b==0){
            return 0;
        }else{
            while(b!=0){
                int temp=a%b;
                a=b;
                b=temp;
            }
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int prefix[]=new int[nums.length];
        int mx=0;
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
            prefix[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prefix);
        long ans=0;
        int l=0;
        int r=nums.length-1;
        while(l<r){
            ans+=gcd(prefix[l],prefix[r]);
            l++;
            r--;
        }
        return ans;
    }
}