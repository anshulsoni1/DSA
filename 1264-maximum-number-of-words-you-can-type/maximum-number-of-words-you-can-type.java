class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int count = 0;
        
        HashSet<Character>set = new HashSet<>();
        for(int i = 0;i<brokenLetters.length();i++){
            set.add(brokenLetters.charAt(i));
        }
       for(int i = 0;i<arr.length;i++){
        int check = 1;
        for(int j =0;j<arr[i].length();j++){
            if(set.contains(arr[i].charAt(j))){
                check =-1;
                break;
            }
        }
        if(check ==1){
            count++;
        }
       }
       return count;
    }
}