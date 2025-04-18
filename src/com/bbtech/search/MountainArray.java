package com.bbtech.search;

/*
    In a mountain array the element are sorted in increasing and then decreasing order,
    that's why it's also called bitonic array.

    e.g. arr = [1, 2, 4, 6, 10, 9, 8, 7]
    here 10 is the peak element, so we have to return 10.
 */
public class MountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 9, 8, 7};
        System.out.println(arr[findPickElement(arr)]);
    }

    private static int findPickElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            /*
                if mid element > mid + 1 element then we know we are in the desc part of the array.
                this may be the ans but look in the left side.
             */
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                /*
                    we are asc part of the array.
                    since mid +1 element > mid element then start should be mid + 1.
                 */
                start = mid + 1;
            }
        }
        /*
            Because of the above 2 checks now we know that the start and end index point to same element
            and that is the largest element.
            start and end always try to find the largest element in the above 2 checks,
            hence when they point to one element that is the max one.
         */
        return start; // or return end; since both are point to same element.
    }
}
