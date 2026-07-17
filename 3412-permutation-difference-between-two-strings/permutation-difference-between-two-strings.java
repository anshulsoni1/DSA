class Solution {
    public int findPermutationDifference(String s, String t) {
       
        HashMap<Character, Integer>map = new HashMap<>();
        
        for(int i = 0;i<t.length();i++){
            map.put(t.charAt(i),i);
        }
        int res = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            res+=Math.abs(i-map.get(ch));
        }
        return res;
    }
}