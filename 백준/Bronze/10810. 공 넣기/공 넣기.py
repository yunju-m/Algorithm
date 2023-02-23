N, M = map(int, input().split())
pocket = [0]*(N+1)

for _ in range(M):
	i, j, k = map(int, input().split())
	for index in range(i, j+1):
		pocket[index] = k

for i in range(1, len(pocket)):
	print(pocket[i], end=" ")