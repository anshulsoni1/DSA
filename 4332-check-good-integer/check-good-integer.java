class Solution {
    public boolean checkGoodInteger(int n) {
        int d = 0;
        int s = 0;
        while(n>0){
            d+=n%10;
            int k= (n%10) * (n%10);
            s+=k;
            n/=10;
        }
        return (s-d>=50);
    }
}