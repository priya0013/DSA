class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
        int dup[]=arr.clone();
        Arrays.sort(dup);
        int rank=1;
        for(int n:dup){
            if(!mp.containsKey(n)){
                mp.put(n,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=mp.get(arr[i]);
        }
        return arr;
    }
}