import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;
        int temp = n;

        while(temp > 1) {
            if(temp % 2 == 1) {
                temp -= 1;
                ans += 1;
            }
            temp /= 2;

        }

        return ans;
    }
}