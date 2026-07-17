class Solution {
    public int findPermutationDifference(String s, String t) {
        int k = 0;
        int sum  =0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            for(int j = 0;j<t.length();j++){
                if(ch == t.charAt(j)){
                    k = j;
                }
            }
            sum+=Math.abs(i-k);

        }
        return sum;
    }
}