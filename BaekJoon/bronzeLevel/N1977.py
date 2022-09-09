#완전제곱수
m = int(input())
n = int(input())
sums = 0
mins = []
for i in range(10000):
	num = i**2
	if num >= m and num <= n:
		sums += num
		mins.append(num)

if len(mins) == 0:
	print(-1)
else:
	print(sums)
	print(min(mins))