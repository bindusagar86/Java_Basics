package com.bbtech.search;
/*
Find the smallest character present in an array that is larger than the target.
if the target element is not present in the array return the smallest/first character.
e.g.
1. ['a', 'b'] target is 'z', then it'll return 'a'
2. ['c', 'f', 'j'] target is 'j' then it'll return 'c'
3. ['c', 'f', 'j'] target is 'f' then it'll return 'c'
 */
public class FindSmallestChar {
    public static void main(String[] args) {
        char[] ch = {'c', 'f', 'j'};
        char target = 'f';

        System.out.println(findCharacter(ch, target));
    }

    private static char findCharacter(char[] ch, char target) {
        int start = 0;
        int end = ch.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < ch[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
//            if (target > ch[mid]){
//                start = mid + 1;
//            }else{
//                end = mid -1;
//            }
        }
        System.out.println(start % ch.length);
        return ch[start % ch.length];
    }
}
