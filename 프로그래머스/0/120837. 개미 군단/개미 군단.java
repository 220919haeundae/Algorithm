class Solution {
    public int solution(int hp) {
        int answer = 0;
        int remain = 0;
        answer += hp/5;
        remain = hp%5;
        answer += remain/3 + remain%3;
        return answer;
    }
}