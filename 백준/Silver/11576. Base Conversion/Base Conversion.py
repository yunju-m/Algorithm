import sys
import math
input = sys.stdin.readline
A, B = map(int, input().split())
n = int(input())
arr = list(map(int, input().split()))
result = []
ten = 0

for i in range(n):
	ten += int(arr[i] * math.pow(A, n-i-1))

while ten:
	nam = ten%B
	result.append(str(nam))
	ten = ten//B
result = result[::-1]

print(' '.join(result))