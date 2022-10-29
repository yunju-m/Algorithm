#최댓값
arr = [0 for _ in range(9)]
for i in range(9):
	arr[i] = list(map(int, input().split())) 

maxs = 0
idx = 0
idy = 0
for i in range(9):
	for j in range(9):
		if maxs < arr[i][j]:
			maxs = arr[i][j]
			idx = i
			idy = j
print(maxs)
print(idx+1, idy+1, end=" ")