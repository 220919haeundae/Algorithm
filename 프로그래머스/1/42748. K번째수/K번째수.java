import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int[] tempArr = new int[commands[i][1] - commands[i][0]];
            tempArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(tempArr);
            answer[i] = tempArr[commands[i][2]-1];
        }
        
        return answer;
    }
}