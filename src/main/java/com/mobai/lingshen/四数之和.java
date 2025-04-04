package com.mobai.lingshen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 四数之和 {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum(nums, -294967296));

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        // 枚举第一个数字
        for (int i = 0; i < nums.length-3; i++) {
            //  避免重复数字
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 枚举第二个数字
            for(int j=i+1;j<nums.length-2;j++){

                //  避免重复数字
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left= j+1;
                int right=nums.length-1;

                while(left<right){
                    long sum=(long)nums[i]+(long)nums[j]+(long)nums[left]+(long)nums[right];
                    if(sum==target){
                        res.add(List.of(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        // 避免重复数字
                        while(left<right&&nums[left]==nums[left-1]){left++;}

                        right--;
                        // 避免重复数字
                        while(left<right&&nums[right]==nums[right+1]){right--;}
                    }
                    if(sum<target){left++;}
                    if(sum>target){right--;}
                }
            }
        }
        return res;

    }
}
