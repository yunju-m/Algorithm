import sys
input = sys.stdin.readline

N, M = map(int, input().split())
price = [int(input()) for _ in range(M)]

price.sort()
res = 0
target = 0
for i in range(M):
	egg = min(M-i,  N)

	if res < price[i] * egg:
		res = price[i] * egg
		target = price[i]
print(target, res)