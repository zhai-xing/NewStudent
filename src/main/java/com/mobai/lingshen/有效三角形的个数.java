package com.mobai.lingshen;

import java.util.Arrays;

public class 有效三角形的个数 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4};
    }

    public static int triangleNumber(int[] nums) {
        //三角形性质 a+b>c a+c>b b+c>a，先排序 使得a<=b<=c,那么 只需要判断 a+b>c即可

        Arrays.sort(nums);
        int res=0;

        //i 为最长边
        for(int i=2;i<nums.length;i++){

            //0
            int left=0;

            //i-1
            int right=i-1;

            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    res+=(right-left);
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return res;
    }
}
