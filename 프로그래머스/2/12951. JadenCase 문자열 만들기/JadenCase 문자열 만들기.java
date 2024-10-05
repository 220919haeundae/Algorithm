class Solution {
    public String solution(String s) {
        String answer = "";
        if('a'<= s.charAt(0) && s.charAt(0) <= 'z') {
            answer += (s.charAt(0)+"").toUpperCase();
        } else {
            answer += s.charAt(0);
        }
        
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1) == ' ') {
                if('a'<= s.charAt(i) && s.charAt(i) <= 'z') {
                    answer += (s.charAt(i)+"").toUpperCase();
                } else {
                    answer += s.charAt(i);
                }
            } else {
                answer += (s.charAt(i)+"").toLowerCase();
            }
        }
        
        return answer;
    }
}