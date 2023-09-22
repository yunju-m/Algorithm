T = 10
dx = [-1, 1, 0, 0]	# 상하좌우
dy = [0, 0, -1, 1]
 
def dfs(x, y) :
    global visited
    q = []
    q.append((x, y))

    while q :
        rx, ry = q.pop(0)
        for i in range(4) :
            nx = rx + dx[i]
            ny = ry + dy[i]
            if 0 <= nx < 100 and 0 <= ny < 100 and maze[nx][ny] in [0, 3] and (nx, ny) not in visited :
                q.append((nx, ny))
                visited.append((nx, ny))
                if maze[nx][ny] == 3 :
                    return True

for _ in range(T) :
    t_case = int(input())
    maze = [list(map(int, input())) for _ in range(100)]
    start = (1, 1)
    visited = []
    print(f"#{t_case}", 1 if dfs(start[0], start[1]) else 0)