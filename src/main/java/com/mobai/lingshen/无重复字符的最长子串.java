package com.mobai.lingshen;

import java.util.HashMap;

public class 无重复字符的最长子串 {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        HashMap<String, Integer> map = new HashMap<>();

        int ans = 0;

        int left = 0;
        for (int right = 0; right < n; right++) {
            String c = s.charAt(right) + "";
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.get(c) > 1) {
                String d = s.charAt(left) + "";
                map.put(d, map.get(d) - 1);
                left++;
            }

            ans= Math.max(ans,right - left + 1);
        }
        return ans;
    }
}
