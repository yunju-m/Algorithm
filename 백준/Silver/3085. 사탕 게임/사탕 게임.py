n = int(input())

arr = []
for _ in range(n):
	colors = list(map(str, input()))
	arr.append(colors)

cnt = 0

def width():
	global cnt

	for k in range(n):
		cntrow = 1
		for l in range(n-1):
			if arr[k][l] == arr[k][l+1]:
				cntrow += 1
				cnt = max(cnt, cntrow)
			else:
				cntrow = 1

def height():
	for k in range(n):
		global cnt

		cntcol = 1
		for l in range(n-1):
			if arr[l][k] == arr[l+1][k]:
				cntcol += 1
				cnt = max(cnt, cntcol)
			else:
				cntcol = 1

for i in range(n):
	for j in range(n-1):
		if arr[i][j] != arr[i][j+1]:
			arr[i][j], arr[i][j+1] = arr[i][j+1], arr[i][j]
			width()
			height()
			arr[i][j+1], arr[i][j] = arr[i][j], arr[i][j+1]

		if arr[j][i] != arr[j+1][i]:
			arr[j][i], arr[j+1][i] = arr[j+1][i], arr[j][i]
			width()
			height()
			arr[j+1][i], arr[j][i] = arr[j][i], arr[j+1][i]

print(cnt)				