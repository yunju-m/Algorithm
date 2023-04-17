N, M = map(int, input().split())
line = []
for i in range(N):
	line.append(list(input()))

maxsize = min(N, M)
result = 0
for i in range(N):
	for j in range(M):
		for k in range(maxsize):
			if ((i+k) < N) and ((j+k) < M) and (line[i][j] == line[i][j+k] == line[i+k][j] == line[i+k][j+k]):
				result = max(result, (k+1)**2)

print(result)