class Solution {
    public void duplicateZeros(int[] arr) {
        List <Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                l.add(0);
                l.add(0);
            }else{
                l.add(arr[i]);
            }
            arr[i]=l.get(i);
        }
        
    }
}