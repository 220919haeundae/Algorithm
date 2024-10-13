import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> intSet = new HashSet<>();
        
        for(int i = 0; i < numbers.length -1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                intSet.add(numbers[i] + numbers[j]);
            }
        }
        answer = new int[intSet.size()];
        int count = 0;
        Iterator<Integer> it = intSet.iterator();
        while(it.hasNext()) {
            answer[count] = it.next();
            count += 1;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}