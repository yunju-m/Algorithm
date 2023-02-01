from collections import Counter
n = int(input())
number = [int(input()) for _ in range(n)]

maxs = 2**62 
cmax = 0

cnt = Counter(number)
for i,j in cnt.items():
	if j > cmax:
		cmax = j

result = []
for i,j in cnt.items():
	if j == cmax:
		result.append(i)
result.sort()
print(result[0])