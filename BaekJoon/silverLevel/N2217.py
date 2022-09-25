#로프
n = int(input())
lope = []
for i in range(n):
	lope.append(int(input()))
lope.sort()
num = 0
for i in lope:
	num = max(i*n, num)
	n-=1
print(num)