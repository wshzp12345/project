package com.albert._3;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class Solution {
    /**
     * use to index to calculate.
     * "start"  anchor the header of the substring , "end" anchor next to the "start", then repeating moving forward.
     * every end move check the current in already appear in start to end-1 substring.
     * if not end keep forwarding. if yes break end repeating, note down the length from start to end-1 if it is bigger then current length.
     * then set start to end ; end to end + 1.
     * finish the method when end is reach the end of string. return t
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, length = 0;
        char[] ss = s.toCharArray();
        while (end < s.length()) {

        }

        return 0;
    }
}
