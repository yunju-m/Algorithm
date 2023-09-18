T = 10

for test_case in range(1, T + 1):
    t_case, size = map(int, input().split())
    roads = list(map(int, input().split()))
    other_roads = [[] for _ in range(100)]

    for i in range(size):
        start = roads[i*2]
        end = roads[i*2+1]
        other_roads[start].append(end)
    
    visited = [False] * 100
    stack = [0]

    while stack:
        now = stack.pop()
        if not visited[now]:
            visited[now] = True

            for v in other_roads[now]:
                if not visited[v]:
                    stack.append(v)

    result = 1 if visited[99] else 0
    print(f"#{test_case} {result}")