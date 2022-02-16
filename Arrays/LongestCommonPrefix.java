package Arrays;

import java.util.HashMap;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return ""; // if null
        for (int i = 0; i < strs[0].length(); i++) {
            char common = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != common) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}