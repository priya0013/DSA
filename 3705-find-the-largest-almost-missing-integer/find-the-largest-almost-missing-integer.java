class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        if(k==1){
            int ans=-1;
            for(int x:nums){
                mp.put(x,mp.getOrDefault(x,0)+1);
            }
            for(int x:nums){
                if(mp.get(x)==1){
                    ans=Math.max(ans,x);
                
                }
            }
                return ans;
            
        }else if(k==n){
            int ans=-1;
            for(int x:nums){
                ans=Math.max(ans,x);
            }
            return ans;
        }else{
            int ans=-1;
            for(int x:nums){
                mp.put(x,mp.getOrDefault(x,0)+1);
            }
            int first=nums[0];
            int second=nums[n-1];
            if(mp.get(first)==1){
                ans=Math.max(first,ans);
            }
            if(mp.get(second)==1){
                ans=Math.max(ans,second);
            }
            return ans;

        }
        //return -1;
    }
}