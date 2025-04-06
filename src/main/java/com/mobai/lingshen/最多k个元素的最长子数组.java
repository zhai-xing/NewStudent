package com.mobai.lingshen;

import java.util.HashMap;

public class 最多k个元素的最长子数组 {
    public static void main(String[] args) {

    }
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int ans=0;
        int left=0;

        if(k==0)return 0 ;

        for(int right=0;right<n;right++){

            map.merge(nums[right], 1, Integer::sum);

            while (map.get(nums[right])>k){
                map.merge(nums[left++], -1, Integer::sum);
            }

            ans=Math.max(ans,right-left+1);
        }

        return ans;
    }
}
