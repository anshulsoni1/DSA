class Solution {
    public int missingMultiple(int[] nums, int k) {

        int multiple = k;

        HashSet<Integer> set = new HashSet<>();
        int j = 1;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]); 
        }
       for(int i = k , z=1 ;z<=100;i+=k){
        if(!set.contains(i)){
            return i;
        }
       }
       return 0;
    }
}