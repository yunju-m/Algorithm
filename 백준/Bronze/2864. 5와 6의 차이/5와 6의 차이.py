import sys
input = sys.stdin.readline

A, B = map(str, input().split())
min_num = int(A.replace('6', '5')) + int(B.replace('6', '5')) #replace함수
max_num = int(A.replace('5', '6')) + int(B.replace('5', '6'))
print(min_num, max_num)