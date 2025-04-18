package com.bbtech.interview;

public class FindOnOff {

    public static void main(String[] args) {
//        int[] systemState = new int[]{0,1,0,0,1,1,0,0};
//        int[] dist = new int[]{3,5,10,12,13,23,30,38};
        int[] systemState = new int[]{1,0,1,1,1,0,1,1};
        int[] dist = new int[]{3,4,6,7,8,9,11,12};
        int result = findMinLength(systemState, dist);
        System.out.println(result);
    }

    private static int findMinLength(int[] systemState, int[] dist) {
        int answer =0;
        for(int i = 0; i< systemState.length; i++){
            if(i==0 && systemState[i]==0){
                int right = dist[i+1] - dist[i];
                answer += right;
            }
            if(i == systemState.length -1 && systemState[i]==0){
                int left = dist[i] - dist[i-1];
                answer += left;
            }
            if(i !=0 && systemState[i] == 0 && i != systemState.length -1){
                int left = dist[i] - dist[i-1];
                int right = dist[i+1] - dist[i];
                int min = Math.min(left, right);
                answer += min;
            }
        }
        return answer;
    }
}
