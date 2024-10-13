import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] q = new int[k];
        int min = score[0];
        
        for(int i = 0; i < k; i++) {
            if(i > score.length-1) break;
            q[i] = score[i];
            if(min > score[i]) {
                min = score[i];
            }
            answer[i] = min;
        }
        
        Arrays.sort(q);
        if(!(score.length < k)) {
            for(int i = k; i < score.length; i++) {
                if(score[i] > q[0]) {
                    q[0] = score[i];
                    Arrays.sort(q);
                }
                answer[i] = q[0];
            }
        }
        
        
        return answer;
    }
}