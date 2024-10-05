class Solution {
    public int solution(String t, String p) {
        int len1 = t.length();
        int len2 = p.length();
        int answer = 0;
        for (int i = 0; i < len1 - len2+1; i++) {
            long num1 = Long.parseLong(t.substring(i, i+len2));
            long num2 = Long.parseLong(p);
            if (num1 <= num2) {
                answer += 1;
            }
        }
        return answer;
    }
}