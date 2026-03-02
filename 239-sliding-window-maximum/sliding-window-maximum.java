class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int id=0;
        Deque<Integer> d=new LinkedList<>();
        int arr[]=new int[n-k+1];
        for(int i=0;i<n;i++){
            if(!d.isEmpty() && d.peekFirst()<=i-k){
                d.pollFirst();
            }
            while(!d.isEmpty() && nums[d.peekLast()]<nums[i]){
                d.pollLast();
            }
            d.offerLast(i);
            if(i>=k-1){
                arr[id++]=nums[d.peekFirst()];
            }
        }
        return arr;
    }
}