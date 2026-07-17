class Solution {
    public int countConsistentStrings(String s, String[] words) {
        int check =1;
        int count = 0;
        HashSet <Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        for(int i = 0;i<words.length;i++){
            String ch = words[i];
           for(int j = 0;j<ch.length();j++){
            if(!set.contains(ch.charAt(j))){
                check = -1;
                break;
            }
        }
        if(check ==1){
            count++;
        }
        check =1;
        }
        return count;
    }
}