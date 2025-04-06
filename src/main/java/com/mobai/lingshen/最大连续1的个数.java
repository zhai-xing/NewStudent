package com.mobai.lingshen;

public class 最大连续1的个数 {
    public static void main(String[] args) {

    }

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int ans=0;
        int count = 0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            while(count>k){
                if(nums[left++]==0){
                    count--;
                }
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
