package linklist;

/**
 * Examples:
 * <p>
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * <p>
 * Given "bbbbb", the answer is "b", with the length of 1.
 * <p>
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.isEmpty()) return 0;
        if(s.length() == 1) return 1;
        char[] chars = s.toCharArray();
        int maxLen = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            StringBuilder sub = new StringBuilder();
            sub.append(chars[i]+"");
            boolean incr = true;
            for (int j = i + 1; j < chars.length && incr; j++) {
                if (sub.toString().contains(chars[j] + "")) {
                    incr = false;
                }else{
                    sub.append(chars[j]+"");
                }
                maxLen = Math.max(maxLen,sub.length());
            }
        }
        return maxLen;
    }
}
