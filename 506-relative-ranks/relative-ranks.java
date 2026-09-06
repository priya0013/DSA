class Solution {
    public String[] findRelativeRanks(int[] score) {
        String []arr=new String[score.length];
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        int id=0;
        for(int i=0;i<score.length;i++){
            if(score[i]>first){
                third=second;
                second=first;
                first=score[i];
                
            }else if(score[i]>second && score[i]!=first){
                third=second;
                second=score[i];
                
            }else if(score[i]>third && score[i]!=second && score[i]!=first){
                third=score[i];
                
            }
        }
        for(int i=0;i<score.length;i++){
            if(score[i]==first){
                arr[i]="Gold Medal";
            }else if(score[i]==second){
                arr[i]="Silver Medal";
            }else if(score[i]==third){
                arr[i]="Bronze Medal";
            }else{
                arr[i] = String.valueOf(getRank(score, score[i]));
            }
        }
        return arr;
    }
    public static int getRank(int score[],int val){
        int rank=1;
        for(int i=0;i<score.length;i++){
            if(score[i]>val){
                rank++;
            }
        }
        return rank;
    }
}