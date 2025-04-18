package com.bbtech.search;
/*
    Find element in an infinite array using binary search.
 */
public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10, 11, 15, 17, 20, 22, 23, 29, 30};
        int target = 8;
        System.out.println("target element present at index: " + findAns(arr, target));
    }

    /*
        This will return the index of target element.

        we have to search the target element in chunks
        initially the chunk size is 2, if not found double the chunk size unit it found.
        So to implement this we have to find the start and end index.
        In 1st step start = 0 and end = 1 since chunk size is 1.
        next start = end + 1 and end = end + (end - start +1) * 2 since double of previous chunk size

        The above condition we have to apply if target > arr[end]
     */
    static int findAns(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
