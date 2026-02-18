class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for(int n1:nums1){
            set1.add(n1);
        }
        for(int n2:nums2){
            if(set1.contains(n2)){
                res.add(n2);
            }
        }
        int arr[]=new int[res.size()];
        int i=0;
        for(int x:res){
            arr[i]=x;
            i++;
        }
        return arr;
    }
}