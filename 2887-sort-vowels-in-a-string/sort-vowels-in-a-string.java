class Solution {
    public String sortVowels(String s) {

        List<Integer> list = new ArrayList<>();
        

       for(char ch : s.toCharArray()){
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            list.add((int)ch);
        }
       }
       int[] arr = new int[list.size()];
for (int i = 0; i < list.size(); i++) {
    arr[i] = list.get(i);
} 
Arrays.sort(arr);

StringBuilder sb  = new StringBuilder();
int j =0;
for(int i = 0; i < s.length(); i++){
    char ch = s.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        sb.append((char) arr[j]);
        j++;
    } else {
        sb.append(ch);
    }
}

return sb.toString();
    }
}