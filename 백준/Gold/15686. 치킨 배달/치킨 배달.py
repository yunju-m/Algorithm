import sys
from itertools import combinations
input = sys.stdin.readline

n, m = map(int, input().split())
city = [list(map(int, input().split())) for _ in range(n)]
house = []
chick = []
result = 99999

for i in range(n):
	for j in range(n):
		if city[i][j] == 1:
			house.append([i, j])
		elif city[i][j] == 2:
			chick.append([i, j])


for ch in combinations(chick, m):
	temp = 0
	for h in house:
		dis = 999
		for j in range(m):
			dis = min(dis, abs(h[0] - ch[j][0]) + abs(h[1] - ch[j][1]))
		temp += dis
	result = min(result, temp)

print(result)