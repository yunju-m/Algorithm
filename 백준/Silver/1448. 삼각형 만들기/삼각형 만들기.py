import sys
input = sys.stdin.readline

n = int(input())
straw = [int(input()) for _ in range(n)]
straw.sort(reverse=True)
sums = 0
find = False

for i in range(2, n):
	if straw[i-2] < (straw[i-1] + straw[i]):
		sums = max(sums, straw[i-2]+straw[i-1]+straw[i])
		find = True
		break

if find:
	print(sums)
else:
	print(-1)