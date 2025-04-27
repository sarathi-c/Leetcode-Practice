class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        int l = 0;
        int r = 0;
        int i = 0;
        while (l < m && r < n) {
            if (nums1[l] < nums2[r]) {
                nums[i] = nums1[l];
                i++;
                l++;
            } else {
                nums[i] = nums2[r];
                i++;
                r++;
            }
        }
        while (l < m) {
            nums[i++] = nums1[l++];
        }

        while (r < n) {
            nums[i++] = nums2[r++];
        }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = nums[k];
        }

    }
}