from collections import deque

def bfs(node):
	queue = deque()
	queue.append(node)
	while queue:
		node = queue.popleft()
		for n in graph[node]:
			if check[n] == 0:
				check[n] = check[node] + 1
				queue.append(n)

n = int(input())
graph = [[]for _ in range(n+1)]
p1, p2 = map(int, input().split())
m = int(input())

for i in range(m):
	x, y = map(int, input().split())
	graph[x].append(y)
	graph[y].append(x)
check = [0]*(n+1)
bfs(p1)
print(check[p2] if check[p2] > 0 else -1)