import sys
input = sys.stdin.readline

N = int(input())
result = 0
for i in range(N):
	result += N * i + i
print(result) 