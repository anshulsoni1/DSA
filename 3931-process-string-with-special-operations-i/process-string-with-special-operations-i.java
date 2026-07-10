class Solution {
    public String processStr(String s) {
        StringBuilder sb  = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
            if(ch=='#'){
                sb.append(sb);
            }
            if(ch=='*' && sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
            }
            if(ch == '%'){
                sb.reverse();
            }
        }
        return sb.toString();
    }
}