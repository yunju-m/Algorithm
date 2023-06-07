from collections import deque
import sys
input = sys.stdin.readline


n = int(input())
graph = []
maxnum = 0

## 최대값 구하기
for i in range(n):
	graph.append(list(map(int, input().split())))
	for j in range(n):
		if graph[i][j] > maxnum:
			maxnum = graph[i][j]

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

def bfs(a, b, value, visited):
	q = deque()
	q.append((a, b))
	visited[a][b] = 1

	while q:
		x, y = q.popleft()

		for i in range(4):
			nx = x + dx[i]
			ny = y + dy[i]
			if 0 <= nx < n and 0 <= ny < n:
				if graph[nx][ny] > value and visited[nx][ny] == 0:
					visited[nx][ny] = 1
					q.append((nx, ny))

result = 0
for i in range(maxnum):
	visited = [[0] * n for _ in range(n)]
	cnt = 0

	for j in range(n):
		for k in range(n):
			if graph[j][k] > i and visited[j][k] == 0:
				bfs(j, k, i, visited)
				cnt+=1

	if result < cnt:
		result = cnt

print(result)