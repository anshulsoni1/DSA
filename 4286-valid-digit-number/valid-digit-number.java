class Solution {
    public boolean validDigit(int n, int x) {
        Boolean bool = false;
        int last = -1;
        while(n>0){
            int digit = n%10;
            last = digit;
            if(digit == x){
                bool = true;
            }
            n/=10;
            
        }
        if (last != x && bool==true){
            return true;
        }
        return false;
    }
}