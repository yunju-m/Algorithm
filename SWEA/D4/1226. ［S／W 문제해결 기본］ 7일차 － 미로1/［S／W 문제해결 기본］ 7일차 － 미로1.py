T = 10

def dfs(x, y):
    global check
    if x < 0 or y < 0 or x >= 16 or y >= 16 or maze[x][y] == 1 or check:
        return

    if maze[x][y] == 3:
        check = True
        return 
    
    if maze[x][y] == 0 or 2:
        maze[x][y] = 1

    dfs(x-1, y) # 상
    dfs(x, y-1) # 좌
    dfs(x+1, y) # 하
    dfs(x, y+1) # 우

for test_case in range(T):
    t_case = int(input())
    maze = [[] for _ in range(16)]
    start = (0, 0)
    check = False

    for i in range(16):
        now = list(map(int, list(input())))
        if 2 in now:
            tmp = now.index(2)
            start = (i, tmp)
        maze[i] = now
    
    dfs(start[0], start[1])
    print(f"#{t_case}", 1 if check else 0) 