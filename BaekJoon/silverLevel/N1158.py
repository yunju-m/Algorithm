n, k = map(int, input().split())
a = []
for i in range(n):
	a.append(i+1)

answer = []
num = 0

for i in range(n):
	num += k-1
	if num >= len(a):
		num = num%len(a)

	answer.append(str(a.pop(num)))
print("<",", ".join(answer)[:], ">", sep='')