import java.util.HashMap;

class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int majorityCount = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            
            if (mp.get(arr[i]) > majorityCount) {
                return arr[i]; 
            }
        }
        return -1;
    }
}
