import sys
input = sys.stdin.readline
N = int(input())
arr = list(map(int, input().split()))
sum_arr = [0] * (N+1)
for i in range(N):
	sum_arr[i+1] = sum_arr[i] + arr[i]

M = int(input())
for i in range(M):
	first, end = map(int, input().split())
	print(sum_arr[end]-sum_arr[first-1])