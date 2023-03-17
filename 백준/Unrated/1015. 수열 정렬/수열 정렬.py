import sys
import math
input = sys.stdin.readline

n = int(input())
A = [int(i) for i in input().split(' ')]
sort_A = sorted(A)
P=[]

for i in range(n):
	idx = sort_A.index(A[i])
	P.append(idx)
	sort_A[idx] = -1

print(*P)