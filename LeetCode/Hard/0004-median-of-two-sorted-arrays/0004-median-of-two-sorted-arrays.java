class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int a = nums1.length;
        int b = nums2.length;
        int low = 0;
        int high = a;
        int len = (a + b + 1) / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int nmid = len - mid;

            int l1 = (mid - 1 >= 0) ? nums1[mid - 1] : Integer.MIN_VALUE;
            int r1 = (mid < a) ? nums1[mid] : Integer.MAX_VALUE;

            int l2 = (nmid - 1 >= 0) ? nums2[nmid - 1] : Integer.MIN_VALUE;
            int r2 = (nmid < b) ? nums2[nmid] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if ((a + b) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return (double)Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; 
    }
}