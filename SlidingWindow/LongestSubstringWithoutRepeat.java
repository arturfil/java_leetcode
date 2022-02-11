package SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        int len = 0;
        for(int i = 0, j = 0; i < s.length(); i++) {
            if (chars.containsKey(s.charAt(i))) {
                j = Math.max(chars.get(s.charAt(i)), j); // get max val of int
            }
            len = Math.max(len, i-j+1);
            chars.put(s.charAt(i), i+1);
        }        
        return len;
    }
}

/*
    TESTING
    String s = "abcabcbb";
    var lsubstring = new LongestSubstringWithoutRepeat();
    lsubstring.lengthOfLongestSubstring(s);

    EXPLANATION
    - check the max running total length of the substring.
    every iteration you grab the max substring len
*/