package com.mobai.lingshen;

public class 正整数和负整数的最大计数 {
    public static void main(String[] args) {

    }
    public int maximumCount(int[] nums) {
        //查找0的第一次出现和最后一次出现的位置
        int left=maximumCount1(nums,0);
        int right=maximumCount1(nums,1)-1;
        return Math.max(left, nums.length-right-1);
    }

    public int maximumCount1(int[] nums,int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]>=target) {
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
