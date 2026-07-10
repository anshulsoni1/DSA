class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = nums[n - 1];

        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];
        for (int l = n - 2; l >= 0; l--) {
            suffixMin[l] = Math.min(nums[l], suffixMin[l + 1]);
        }

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = suffixMin[i];
            int ans = max - min;
            if (ans <= k) {
                return i;
            }
        }
        return -1;
    }
}