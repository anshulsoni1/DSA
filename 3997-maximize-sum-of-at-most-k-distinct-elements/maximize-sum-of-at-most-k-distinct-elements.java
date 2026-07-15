

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[k];
        int index = 0;

       
        for (int i = nums.length - 1; i >= 0; i--) {
            if (index == k) {
                break;
            }

            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                arr[index] = nums[i];
                index++;
            }
        }
        
return Arrays.copyOf(arr, index);    }
}
