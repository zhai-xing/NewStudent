package com.mobai.lingshen;

public class 统计得分小于k的子数组数目 {
    public static void main(String[] args) {

    }

    public int countSubarrays(int[] nums, int k) {
        int ans = 0;
        int left = 0;

        int sum=0;

        for(int right=0;right<nums.length;right++) {
            sum+=nums[right];

            while(sum*(right-left+1)>=k){
                sum-=nums[left++];
            }
            ans+=right-left+1;
        }
        return ans;
    }
}
