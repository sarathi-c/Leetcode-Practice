class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < haystack.length()-needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                int k = i;
                while (k < haystack.length() && j < needle.length() && haystack.charAt(k) == needle.charAt(j)) {
                    j++;
                    k++;
                    if (j == needle.length()) {
                        return i;
                    }

                }
            }
        }
        return -1;
    }
}