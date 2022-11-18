#올림픽
import sys
sys = sys.stdin.readline
n, k = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
arr.sort(key=lambda x: (-x[1], -x[2], -x[3]))

for i in range(n):
	if arr[i][0] == k:
		index = i
for i in range(n):
	if arr[index][1:] == arr[i][1:]:
		print(i+1)
		break
