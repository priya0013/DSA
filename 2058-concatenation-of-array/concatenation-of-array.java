class Solution {
    public int[] getConcatenation(int[] nums) {
        int m=nums.length;
       int n=nums.length*2;
       int arr[]=new int[n];
       for(int i=0;i<m;i++){
        arr[i]=arr[i+m]=nums[i];
       
       }
       return arr;

        
    }
}