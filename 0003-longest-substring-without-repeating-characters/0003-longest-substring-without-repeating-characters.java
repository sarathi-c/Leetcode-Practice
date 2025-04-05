class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = 0;
            HashSet<Character> hs = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (hs.contains(s.charAt(j))) {
                    break;
                }
                hs.add(s.charAt(j));
                len++;
            }
            if (len > maxLength) {
                maxLength = len;
            }
        }
        return maxLength;
    }
}