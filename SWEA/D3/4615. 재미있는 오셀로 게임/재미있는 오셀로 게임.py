T = int(input())
for tc in range(1, T+1):
    N, M = map(int, input().split())
    matrix = [[0 for _ in range(N)] for _ in range(N)]
    matrix[N//2-1][N//2-1:N//2+1] = [2, 1]
    matrix[N//2][N//2-1:N//2+1] = [1, 2]
    Go = []
    for _ in range(M):
        Go += [list(map(int, input().split()))]

    dxy = [(1, 0), (-1, 0), (0, 1), (0, -1), (1, 1), (1, -1), (-1, 1), (-1, -1)]
    while Go:
        x, y, c = Go.pop(0)
        matrix[y-1][x-1] = c

        for dy, dx in dxy:
            ny, nx = y - 1 + dy, x - 1 + dx
            change = [[ny, nx]]

            while -1 < nx < N and -1 < ny < N and matrix[ny][nx] != 0 and c != matrix[ny][nx]:
                ny, nx = ny + dy, nx + dx
                change.append([ny, nx])

            if len(change) > 1 and -1 < nx < N and -1 < ny < N and matrix[ny][nx] != 0:
                for i, j in change:
                    matrix[i][j] = c

    b_cnt = 0
    w_cnt = 0
    for i in range(N):
        for j in range(N):
            if matrix[i][j] == 1:
                b_cnt += 1
            elif matrix[i][j] == 2:
                w_cnt += 1
    print('#{} {} {}'.format(tc, b_cnt, w_cnt))