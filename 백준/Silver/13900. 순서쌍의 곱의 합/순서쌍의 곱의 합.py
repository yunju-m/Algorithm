import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
sum_arr = sum(arr)
res = 0

for i in range(n):
	sum_arr -= arr[i]
	res += sum_arr * arr[i]
print(res)