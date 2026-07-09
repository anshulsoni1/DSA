class Solution {
    public int countMonobit(int n) {
        int count = 0;

        for (int i = 0; i <= n; i++) {
            boolean bool = true;

            String k = Integer.toBinaryString(i);

            for (int l = 0; l < k.length() - 1; l++) {
                if (k.charAt(l) != k.charAt(l + 1)) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                count++;
            }

        }

        return count;
    }
}