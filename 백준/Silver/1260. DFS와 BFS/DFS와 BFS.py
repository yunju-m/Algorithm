from collections import deque
import sys
 
n, m, start = map(int, sys.stdin.readline().strip().split())
 
edge = [[] for _ in range(n + 1)]
 
for _ in range(m):
    v1, v2 = map(int, sys.stdin.readline().strip().split())
    edge[v1].append(v2)
    edge[v2].append(v1)
 
for e in edge:
    e.sort()
 
d_check = [False for _ in range(n + 1)]

def dfs(x):
    d_check[x] = True
    print(x, end = ' ')
    for y in edge[x]:
        if d_check[y] == False:
            dfs(y)
 
def bfs():
    queue = deque([start])
    b_check = [False for _ in range(n + 1)]
    b_check[start] = True
    while queue:
        v = queue.popleft()
        print(v, end = ' ')
        for i in edge[v]:
            if not b_check[i]:
                b_check[i] = True
                queue.append(i)
 
dfs(start)
print()
bfs()
print()