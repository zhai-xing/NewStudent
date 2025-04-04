package com.mobai.lingshen;

import java.util.Arrays;

public class 最接近的三数之和16 {

//    给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
//
//    返回这三个数的和。
//
//    假定每组输入只存在恰好一个解。

    public static void main(String[] args) {

    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int res=nums[0]+nums[1]+nums[2];
        //将i与剩下的有序数组中的元素求和并比较， 优化时间复杂度，实际上就是通过一次比较能获得更多的信息
        // 例如 当数组有序时，若num[left]+num[right]<target,则num[left]+num[right-1]和num[left]+num[right-2]也一定小于target
        for(int i=0;i<nums.length;i++){

            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }
                if(Math.abs(sum-target)<Math.abs(res-target)){
                    res=sum;
                }
                if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return res;
    }
}
