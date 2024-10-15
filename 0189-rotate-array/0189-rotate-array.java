class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                temp[i] = nums[nums.length - k + i];
            } else {
                temp[i] = nums[i - k];
            }
        }
        int j = 0;
        for (int i : temp) {
            nums[j] = i;
            j++;
        }
    }
}