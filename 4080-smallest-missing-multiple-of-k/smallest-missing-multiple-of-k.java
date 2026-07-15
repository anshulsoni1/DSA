class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = k, z = 1; z <= 101; i += k,z++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}