class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append(' ');
            } else {
                if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                    if('A' <= s.charAt(i)+n && s.charAt(i)+n <= 'Z') {
                        sb.append((char)(s.charAt(i)+n));
                    } else {
                        sb.append((char)(s.charAt(i)+n-26));
                    }
                } else {
                    if('a' <= s.charAt(i)+n && s.charAt(i)+n <= 'z') {
                        sb.append((char)(s.charAt(i)+n));
                    } else {
                        sb.append((char)(s.charAt(i)+n-26));
                    }
                }
                
                
                
                
            }
        }
        
        answer = sb.toString();
        System.out.println(answer);
        return answer;
    }
}