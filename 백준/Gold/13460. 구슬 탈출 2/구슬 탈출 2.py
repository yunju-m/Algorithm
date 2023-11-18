N, M = map(int, input().split())
boards = [list(input()) for _ in range(N)]
dx = [-1,1,0,0]
dy = [0,0,-1,1]
queue = [] # bfs 사용
visited = [[[[False] * M for _ in range(N)] for _ in range(M)] for _ in range(N)]

# 시작 조건
def pos_init():
    rx, ry, bx, by = 0, 0, 0, 0
    for i in range(N):
        for j in range(M):
            if boards[i][j] == 'R':
                rx, ry = i, j   # 처음 R의 위치
            elif boards[i][j] == 'B':
                bx, by = i, j   # 처음 B의 위치
    queue.append((rx,ry,bx,by,1))
    visited[rx][ry][bx][by] = True

def move(x, y, dx, dy):
    cnt = 0
    while boards[x+dx][y+dy] != '#' and boards[x][y] != 'O':
        x += dx
        y += dy
        cnt += 1
    return x, y, cnt

def solve():
    pos_init()
    while queue:
        rx, ry, bx, by, depth = queue.pop(0)    # FIFO
        if depth > 10:
            break
        for i in range(4):  # 4방향으로 이동하며 공간을 찾음
            nrx, nry, rcnt = move(rx, ry, dx[i], dy[i])
            nbx, nby, bcnt = move(bx, by, dx[i], dy[i])
            if boards[nbx][nby] != 'O':
                if boards[nrx][nry] == 'O':
                    print(depth)
                    return
                if nrx == nbx and nry == nby:
                    if rcnt > bcnt:
                        nrx -= dx[i]
                        nry -= dy[i]
                    else:
                        nbx -= dx[i]
                        nby -= dy[i]
                if not visited[nrx][nry][nbx][nby]:
                    visited[nrx][nry][nbx][nby] = True
                    queue.append((nrx, nry, nbx, nby, depth+1))
    print(-1)

solve()