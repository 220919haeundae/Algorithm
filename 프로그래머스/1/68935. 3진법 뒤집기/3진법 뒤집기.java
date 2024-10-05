class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder builder = new StringBuilder();
        
        
        while(n > 0) {
            builder.append(String.valueOf(n%3));
            n /= 3;
        }
        
        
        String reverseBase = builder.toString();
        System.out.println(reverseBase);
        
        for(int i = 0; i < reverseBase.length(); i++) {
            answer += Integer.parseInt(reverseBase.charAt(i)+"") * Math.pow(3, reverseBase.length()-1-i);
        }
        
        
        return answer;
    }
}