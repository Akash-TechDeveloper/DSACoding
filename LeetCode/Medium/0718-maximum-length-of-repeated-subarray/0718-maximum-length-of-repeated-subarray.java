class Solution {
    boolean possible(int len, int[] nums1, int[] nums2) {
        for (int i = 0; i <= nums1.length - len; i++) {
            for (int j = 0; j <= nums2.length - len; j++) {
                boolean match = true;
                for (int k = 0; k < len; k++) {
                    if (nums1[i + k] != nums2[j + k]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }
    public int findLength(int[] nums1, int[] nums2) {
        int low = 1, high = Math.min(nums1.length, nums2.length), ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(mid,nums1, nums2)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}