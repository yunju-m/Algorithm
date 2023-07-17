import sys
input = sys.stdin.readline

N, M = map(int, input().split())
arr = sorted(list(map(int, input().split())))
visited = [False]*N
result = []

def dfs(start):
	if len(result) == M:
		print(*result)
		return
	cnt = 0
	for n in range(start, N):
		if not visited[n] and cnt != arr[n]:
			visited[n] = True
			result.append(arr[n])
			cnt = arr[n]
			dfs(n+1)
			visited[n] = False
			result.pop()
dfs(0)