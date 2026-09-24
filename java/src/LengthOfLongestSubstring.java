import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbabcdef"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty())
            return 0;

        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0, left = 0;
        int maxStart = 0, maxEnd = 0;

        for(int right = 0; right < s.length() - 1; right++) {
            char ch = s.charAt(right);

            if(map.containsKey(ch)) {
                left  = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);

            if (right - left + 1 > maxLength) {
                maxLength = Math.max(maxLength, right - left + 1);
                maxStart = left;
                maxEnd = right + 1;
            }
        }
        System.out.println(s.substring(maxStart, maxEnd));
        return maxLength;
    }
}
