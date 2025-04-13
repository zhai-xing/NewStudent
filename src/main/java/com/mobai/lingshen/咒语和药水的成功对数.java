package com.mobai.lingshen;

import java.util.Arrays;

public class 咒语和药水的成功对数 {
    public static void main(String[] args) {

    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int index= binarySearch(potions,spells[i],success);
            res[i] = potions.length - index;
        }
        return res;
    }

    //二分查找 找第一个大于等于success的元素
    public int binarySearch(int[] potions,int x, long success) {
        int left = 0;
        int right = potions.length - 1;
        while (left <= right) {
            int mid=left+(right-left)/2;
            if ((long) potions[mid] *x >= success) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
