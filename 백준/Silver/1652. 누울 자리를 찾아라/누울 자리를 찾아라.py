n = int(input())
arr = []
for i in range(n):
	arr.append(input())

mcol, mrow = 0, 0
for y in range(n):
	col, row = 0, 0
	for x in range(n):
		if arr[y][x] == '.':
			col+=1
		elif arr[y][x] == 'X':
			if col >= 2:
				mcol+=1
			col = 0

		if arr[x][y] == '.':
			row+=1
		elif arr[x][y] == 'X':
			if row >= 2:
				mrow+=1
			row = 0

		if x == n-1:
			if col >= 2:
				mcol += 1
			if row >= 2:
				mrow += 1
print(mcol, mrow)		