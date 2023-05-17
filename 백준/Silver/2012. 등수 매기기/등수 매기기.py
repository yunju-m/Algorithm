import sys
input = sys.stdin.readline

N = int(input())
arr=[]
for i in range(N):
	arr.append(int(input()))
arr.sort()

result = 0
for r in range(1, N+1):
	result += abs(r-arr[r-1])
print(result)