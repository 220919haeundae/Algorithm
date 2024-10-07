class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int min = Math.min(sides[0], sides[1]);
        int max = Math.max(sides[0], sides[1]);
        
        for(int i = max-min + 1; i < max; i++) {
            answer += 1;
        }
        for(int i = max; i < min + max; i++) {
            answer += 1;
        }
        
        return answer;
    }
}