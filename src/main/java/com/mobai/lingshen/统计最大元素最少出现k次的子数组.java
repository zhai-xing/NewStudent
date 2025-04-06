package com.mobai.lingshen;

import java.util.Arrays;

public class 统计最大元素最少出现k次的子数组 {
    public static void main(String[] args) {

    }


    public long countSubarrays(int[] nums, int k) {

        //先找到最大值
        int max=nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        //
        int count=0;
        long ans=0;
        int left=0;

        for(int right=0;right<nums.length;right++){

            if(nums[right]==max){
                count++;
            }

            while(count==k){
                if(nums[left++]==max){
                    count--;
                }
            }

            //对于右端点为 right 且左端点小于 left 的子数组，max 的出现次数都至少为 k，把答案增加 left。
            ans+=left;

        }

        return ans;
    }
}
