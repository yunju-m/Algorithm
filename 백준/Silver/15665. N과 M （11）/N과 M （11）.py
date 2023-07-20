import sys
input = sys.stdin.readline
N, M = map(int, input().split())
arr = sorted(list(map(int, input().split())))
result = []

def dfs():
	if len(result) == M:
		print(*result)
		return
	cnt = 0
	for n in range(N):
		if cnt != arr[n]:
			result.append(arr[n])
			cnt = arr[n]
			dfs()
			result.pop()
dfs()
