import sys
input = sys.stdin.readline

N = int(input())
board = [list(map(int, input().split())) for _ in range(N)]

visit = [[0] * N for _ in range(N)] # 방문 여부
queue = [[0, 0]]	# 현재 위치
dx = [1, 0]			# 아래
dy = [0, 1] 		# 오른쪽

while queue:
	x, y = queue[0][0], queue[0][1]
	del queue[0]

	if board[x][y] == -1:
		print("HaruHaru")
		exit(0)

	jump = board[x][y]

	for i in range(2):
		nx = x + dx[i] * jump
		ny = y + dy[i] * jump

		if 0 <= nx < N and 0 <= ny < N and visit[nx][ny] == 0:
			visit[nx][ny] = 1
			queue.append([nx, ny])
print("Hing")