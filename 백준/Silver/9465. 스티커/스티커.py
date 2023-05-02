T = int(input())
for i in range(T):
	st = []
	n = int(input())
	st = [list(map(int, input().split())) for _ in range(2)]
	for j in range(1, n):
		if j == 1:
			st[0][j] += st[1][j-1]
			st[1][j] += st[0][j-1]
		else:
			st[0][j] += max(st[1][j-1], st[1][j-2])
			st[1][j] += max(st[0][j-1], st[0][j-2])
	print(max(st[0][n-1], st[1][n-1]))