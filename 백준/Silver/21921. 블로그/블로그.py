import sys
input = sys.stdin.readline

n, x = map(int, input().split())
visitor = list(map(int, input().split()))
if max(visitor) == 0:
	print('SAD')
else:
	sums = sum(visitor[:x])
	new_sums = sums
	cnt = 1
	for i in range(x, n):
		new_sums -= visitor[i-x]
		new_sums += visitor[i]
		if new_sums > sums:
			sums = new_sums
			cnt = 1
		elif new_sums == sums:
			cnt += 1
	print(sums)
	print(cnt)