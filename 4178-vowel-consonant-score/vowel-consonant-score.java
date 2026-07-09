class Solution {
    public int vowelConsonantScore(String s) {
        int v= 0;
        int c = 0;
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                
             if(s.charAt(i)=='a'|| ch =='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }
            
            else c++;
            }
        }
        if(c==0){
            return c;
        }
        
        return v/c;
    }
}