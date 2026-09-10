class Solution {
    public boolean isHappy(int n) {

     

        HashSet<Integer> set=new HashSet<>();
       while(n!=1 && !set.contains(n)){
         set.add(n);
        n=rec(n);
        
       }

        return n==1;


     
        
    }
    public int rec(int x){
        int sum=0;
        while(x!=0){
            int digit = x%10;
            sum+=digit*digit;
            x/=10;
        }
        return sum;
    }
}