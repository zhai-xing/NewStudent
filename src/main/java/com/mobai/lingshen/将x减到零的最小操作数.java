package com.mobai.lingshen;

public class 将x减到零的最小操作数 {
    public static void main(String[] args) {

    }

    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int target=sum-x;

        int left=0;
        int ans=-1;

        int s=0;
        for(int right=0;right<nums.length;right++){
            s+=nums[right];

            while(s>target&& left<=right){
                s-=nums[left++];
            }

            if(s==target){
                ans=Math.max(ans,right-left+1);
            }
        }

        return ans==-1?-1:nums.length-ans;
    }
}
