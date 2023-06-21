import sys
input = sys.stdin.readline

n = int(input())

def roundfuc(num):
	return int(num) + (1 if num - int(num) >= 0.5 else 0)

if n == 0:
	print(0)
else:
	level = [int(input()) for _ in range(n)]
	level.sort()
	sums = 0
	t_mean = roundfuc(n * 0.15)
	for i in range(t_mean, n-t_mean):
		sums += level[i]
	print(roundfuc(sums/(n-t_mean*2)))