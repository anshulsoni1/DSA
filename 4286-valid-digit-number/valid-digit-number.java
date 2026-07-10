class Solution {
    public boolean validDigit(int n, int x) {
        Boolean bool = false;
        int last = -1;
        while(n>0){
            
            last = n%10;
            if(n%10 == x){
                bool = true;
            }
            n/=10;
            
        }
        return (last != x && bool);
           
    }
}