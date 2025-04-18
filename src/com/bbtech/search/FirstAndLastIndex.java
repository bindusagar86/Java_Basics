package com.bbtech.search;

import java.util.Arrays;

/*
 Given a sorted array find the first and last index occurrence of the target element
 e.g. arr = [5, 6, 7, 7, 7, 7,8, 8, 9]
 target is 8, ans is [2, 5]
 */
public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 7, 7, 7,8, 8, 9};
        int target = 7;
        System.out.println(Arrays.toString(searchOccurrence(nums, target)));
    }

    private static int[] searchOccurrence(int[] nums, int target) {
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        int[] result = {start, end};
        return result;
    }

    private static int search(int[] nums, int target, boolean isFirstIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                //potential answer
                ans = mid;
                if(isFirstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
