package Day_11.Is_Subsequence;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int subSize = s.length();
        int seqSize = t.length();

        if (subSize == 0) {
            return true;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int i = 0;
        int j = 0;

        while (i < seqSize && j < subSize) {
            if (tChars[i] == sChars[j]) {
                j++;
            }
            i++;
        }

        return j == subSize;
    }
}