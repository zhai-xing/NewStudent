package com.mobai.lingshen;

public class 长度最小的子数组 {
    public static void main(String[] args) {

    }
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        int ans=n+1;
        int sum=0;
        int left=0;

        // 枚举右端点
        for(int right=0;right<n;right++){
            sum+=nums[right];

            //若符合条件 则收缩左端点
            while(sum>=target){
                ans=Math.min(ans,right-left+1);
                sum-=nums[left];
                left++;
            }

        }

        return ans==n+1?0:ans;

    }
}
