class Solution {
    public int[] solution(String s) {
        String[] strArr = s.split("");
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        for(int i = 1; i < s.length(); i++) {
            for(int j = 0; j < i; j++) {
                if(strArr[i].equals(strArr[j])) {
                    answer[i] = i-j;
                }
            }
            if(answer[i] == 0) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}