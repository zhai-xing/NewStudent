package com.mobai.lingshen;

import java.util.Arrays;

public class 两数之和006 {

    //https://leetcode.cn/problems/kLl5u1/description/
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while (left<right){
            if(numbers[left]+numbers[right]==target){
                return new int[]{left,right};
            }
            if(numbers[left]+numbers[right]<target){
                left++;
            }else{
                right--;
            }
        }

        //没找到
        return new int[]{0,0};
    }
}
