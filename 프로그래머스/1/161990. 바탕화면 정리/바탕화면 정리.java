class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minY=0;
        answer[1] = -1;
        int maxY=0;
        answer[3] = -1;
        
        for(int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                minY = i;
                break;
            }
        }
        for(int i = wallpaper.length -1; i >= 0; i--) {
            if(wallpaper[i].contains("#")) {
                maxY = i+1;
                break;
            }
        }
        for(int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                if(answer[1] == -1 || answer[1] > wallpaper[i].indexOf("#")) {
                    answer[1] = wallpaper[i].indexOf("#");
                }
                if(answer[3] == -1 || answer[3] < wallpaper[i].lastIndexOf("#")+1) {
                    answer[3] = wallpaper[i].lastIndexOf("#") + 1;
                }
            }
        }
        
        answer[0] = minY;
        answer[2] = maxY;
        
        return answer;
    }
}