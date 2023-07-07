import sys
input = sys.stdin.readline

T = int(input())
for _ in range(T):
	n = int(input())
	arr = []
	for _ in range(n):
		arr.append(list(map(str, input().split())))
	result = sorted(arr, key = lambda x : -int(x[1]))
	print(result[0][0])