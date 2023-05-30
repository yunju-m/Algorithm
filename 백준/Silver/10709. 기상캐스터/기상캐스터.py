import sys
input = sys.stdin.readline

h, w = map(int, input().split())
clude = []
for i in range(h):
	clude.append(input())

result = [[0]*w for _ in range(h)]
ac = False
cnt = 1

for i in range(h):
	for j in range(w):
		if ac == False and clude[i][j] == '.':
			result[i][j] = -1
		elif clude[i][j] == 'c':
			ac = True
			cnt = 1
		else:
			result[i][j] = cnt
			cnt += 1
	ac = False
	cnt = 1

for i in range(h):
	for j in range(w):
		print(result[i][j], end=" ")
	print()