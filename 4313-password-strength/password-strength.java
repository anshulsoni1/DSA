class Solution {
    public int passwordStrength(String s) {
        int count= 0;
        HashSet<Character>set = new HashSet<>();
        for(int i =0;i< s.length();i++){
            set.add(s.charAt(i));
        }
        for(char ch:set){
            
            if(Character.isLowerCase(ch)){
                count++;
            }
            else if(Character.isUpperCase(ch)){
                count+=2;
            }
            else if(Character.isDigit(ch)){
                count+=3;
            }else count+=5;
            
            
        }
        return count;
    }
}