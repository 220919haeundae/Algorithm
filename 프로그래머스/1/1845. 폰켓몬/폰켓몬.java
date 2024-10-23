import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        answer += 1;
        int temp = 0;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[temp] == nums[i]) {
                continue;
            } else {
                answer += 1;
                temp = i;
            }
        }
        answer = (answer > nums.length/2) ? nums.length/2 : answer;
        return answer;
    }
}