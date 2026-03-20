class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        int mx=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum+=-1;
            }else{
                sum+=1;
            }
            if(h.containsKey(sum)){
                int pre=h.get(sum);
                mx=Math.max(mx,i-pre);
            }else{
                h.put(sum,i);
            }
        }
        return mx;

    }
}