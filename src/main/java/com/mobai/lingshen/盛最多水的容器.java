package com.mobai.lingshen;

import java.util.Map;

public class 盛最多水的容器 {
    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            res= Math.max(res,Math.min(height[left],height[right])*(right-left));
            //移动短版
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return res;
    }


}
