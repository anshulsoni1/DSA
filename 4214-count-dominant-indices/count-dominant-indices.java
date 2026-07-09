class Solution {
    public int dominantIndices(int[] nums) {
        int sum = 0;
        int arrcount = 0;
        int count = 0;
        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                sum+=nums[j];
                arrcount++;
            }
            if(arrcount==0){
                continue;
            }
            if(nums[i]>sum/arrcount){
                count++;
            }
            
            arrcount =0;
            sum = 0;
            
        }
        return count;
    }
}