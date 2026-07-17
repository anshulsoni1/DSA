class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>s = new HashSet<>();
        int count= 0;
        int count1 = 0;

        for(int i = 0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            s.add(nums2[i]);
        }

        for(int i = 0;i<nums1.length;i++){
            if(s.contains(nums1[i])){
                count++;
            }
        }
        for(int i = 0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                count1++;
            }
        }
        int arr[] = new int[2];
        arr[0] = count;
        arr[1] = count1;
        return arr;

    }
}