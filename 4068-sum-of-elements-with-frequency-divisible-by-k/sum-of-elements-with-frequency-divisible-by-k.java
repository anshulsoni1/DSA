class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()%k==0){
                list.add(entry.getKey());
            }
        }
        for(int i =0;i<nums.length;i++){
            if(list.contains(nums[i])){
                sum+=nums[i];
            }
        }
        return sum;
    }
}