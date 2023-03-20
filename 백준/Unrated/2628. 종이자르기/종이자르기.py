r, c = map(int, input().split())
row = [0, r]
column = [c, 0]

n = int(input())
for _ in range(n):
	rc, line = map(int, input().split())
	if rc == 1:
		row.append(line)
	else:
		column.append(line)

row.sort()
column.sort()

result_r = []
result_c = []

for i in range(len(row)-1):
	result_r.append(row[i+1] - row[i])
for i in range(len(column)-1):
	result_c.append(column[i+1] - column[i])

print(max(result_r) * max(result_c))