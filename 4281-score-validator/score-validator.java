class Solution {
    public int[] scoreValidator(String[] s) {
        int arr[] = new int[2];
        int score = 0;
        int counter = 0;
        for(int i =0;i<s.length;i++){
            if(s[i].equals("1")){
                score+=1;
            }
            if(s[i].equals("2")){
                score+=2;
            }
            if(s[i].equals("3")){
                score+=3;
            }
            if(s[i].equals("4")){
                score+=4;
            }
            if(s[i].equals("6")){
                score+=6;
            }
            if(s[i].equals("WD")){
                score++;
            }

            if(s[i].equals("W")){
                counter+=1;
            }
            
            if(s[i].equals("NB")){
                score++;
            }
            if(counter==10) break;
        }
        arr[0] =score;
        
        arr[1] = counter;
        return arr;
    }
}