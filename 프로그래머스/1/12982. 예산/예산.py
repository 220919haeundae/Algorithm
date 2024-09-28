def solution(d, budget):
    answer = 0
    d.sort()
    len(d)>=1 and len(d)<=100
    budget>=1 and budget<=10000000
    for i in d:
        i>=1 and i<=100000
        if budget-i > 0:
            budget -= i
            answer += 1
        elif budget-i == 0:
            budget -= i
            answer += 1
        else: continue
    return answer
            
    