package com.mobai.lingshen;

import java.util.Comparator;
import java.util.List;

public class 统计和小于目标的下标对数目2824 {
    public static void main(String[] args) {

    }

    public int countPairs(List<Integer> nums, int target) {
        nums.sort(Comparator.comparingInt(a -> a));
        int res = 0;
        int left=0;
        int right=nums.size()-1;
        while(left<right){
            if(nums.get(left)+nums.get(right)<target){
                //若num[left]+nums[right]<target,则 nums[left]+nums[i] 在i属于区间[left+1,right]之间任意取值都满足条件，则直接找到了 right-left 个满足条件的组合
                res+=right-left;
                left++;
            }else{
                right--;
            }

        }
        return res;
    }

}
