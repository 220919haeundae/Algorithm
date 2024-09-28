
from itertools import combinations

def solution(number):
    return sum(not sum(c) for c in combinations(number, 3))