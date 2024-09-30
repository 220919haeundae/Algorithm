class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int min = Integer.valueOf(strArr[0]);
        int max = Integer.valueOf(strArr[0]);
        for(String i : strArr) {
            if(min>Integer.parseInt(i)) min = Integer.valueOf(i);
            if(max<Integer.valueOf(i)) max = Integer.parseInt(i);
        }
        
        return min +" "+max;
        
    }
}