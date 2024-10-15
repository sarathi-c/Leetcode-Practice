class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int value = 0;
        for (int i : nums) {
            if (count == 0) {
                value = i;
            }
            if (i == value) {
                count++;
            } else {
                count--;
            }
        }
        return value;
    }
}