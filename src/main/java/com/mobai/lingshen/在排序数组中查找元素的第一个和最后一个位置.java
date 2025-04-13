package com.mobai.lingshen;

public class 在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{searchRange2(nums,target),searchRange2(nums,target)};
    }

    //找第一个大于等于target的数
    public int searchRange2(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while (l<=r){
            int mid=l+(r-l)/2;
            // 保持 循环不变量，mid左边的都是小于t mid右边的数都是大于等于t
            if (nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        if (l>=nums.length||nums[l]!=target){
            return -1;
        }
        return r+1;
    }

}
