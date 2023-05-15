from bisect import bisect_left, bisect_right
import sys
input = sys.stdin.readline

T = int(input())
for i in range(T):
	N, M = map(int, input().split())
	A = list(map(int, input().split()))
	B = list(map(int, input().split()))
	A.sort()
	B.sort()
	cnt = 0
	for i in range(N):
		cnt += bisect_left(B, A[i])
	print(cnt)