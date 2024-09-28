function solution(a, b, n) {
    let answer = 0;
    let share = 0;
    let remain = 0;
    let totalBottle = n;
    while(totalBottle >= a) {
        share = Math.floor(totalBottle / a) * b;
        remain = totalBottle % a;
        answer += share;
        totalBottle = share + remain;
    }
    
    return answer;
}