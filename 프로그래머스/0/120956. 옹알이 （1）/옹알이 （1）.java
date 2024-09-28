class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] basic = new String[] {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < basic.length; i++) {
            for(int j = 0; j < babbling.length; j++) {
                if(babbling[j].contains(basic[i])) {
                    babbling[j] = babbling[j].replace(basic[i], " ");
                }
                System.out.println(j + " " + babbling[j]);
            }
        }
        
        for(String a : babbling) {
            if(a.trim().equals("")) {
                answer += 1;
            }
        }
        
        return answer;
    }
}