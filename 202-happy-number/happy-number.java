
class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        slow=square_num(slow);
        fast=square_num(square_num(fast));
        while(slow!=fast){
            slow=square_num(slow);
            fast=square_num(square_num(fast));
            
        }
        return slow==1;
    }
    public int square_num(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}