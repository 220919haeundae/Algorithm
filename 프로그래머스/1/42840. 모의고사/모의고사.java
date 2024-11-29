import java.util.*;
    
class Solution {
    public int[] solution(int[] answers) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int[] p1sol = {1, 2, 3, 4, 5};
        int p1solcurr = 0;
        int[] p2sol = {2, 1, 2, 3, 2, 4, 2, 5};
        int p2solcurr = 0;
        int[] p3sol = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int p3solcurr = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(p1solcurr != 0 && p1solcurr % 5 == 0) {p1solcurr -= 5;};
            if(answers[i] == p1sol[p1solcurr]) {p1 += 1;};
            p1solcurr += 1;
            
            if(p2solcurr != 0 && p2solcurr % 8 == 0) {p2solcurr -= 8;};
            if(answers[i] == p2sol[p2solcurr]) {p2 += 1;};
            p2solcurr += 1;
            
            if(p3solcurr != 0 && p3solcurr % 10 == 0) {p3solcurr -= 10;};
            if(answers[i] == p3sol[p3solcurr]) {p3 += 1;};
            p3solcurr += 1;
        }
        int max = Math.max(p1, Math.max(p2, p3));
        
        List<Integer> list = new ArrayList<>();
        if(p1 == max) list.add(1);
        if(p2 == max) list.add(2);
        if(p3 == max) list.add(3);
        
        
        return list.stream().mapToInt(e -> e).toArray();
    }
}