public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silenz"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] count =new int[26];
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) -'b']++;
            count[t.charAt(i) - 'b']--;
        }
        for(int c : count)
            if(c != 0)
                return false;
        return true;

    }
}
