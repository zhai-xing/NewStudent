package com.mobai.lingshen;

public class 乘积小于k的子数组 {

    public static void main(String[] args) {

    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;

        int res=0;
        int left=0;

        int sum=1;
        if(k<=1)return 0;

        // 枚举右端点
        for (int right = 0; right < n; right++) {
            sum *= nums[right];

            while (sum >= k){//注意这里要加left<n，否则会越界
                sum /= nums[left];
                left++;
            }

            // 若l-r的乘积小于k，则l-r的所有子数组都符合条件
            // 子数组的个数 l-r+1;
            res+=right-left+1;
        }

        return res;
    }

}

