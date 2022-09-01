#뒤집기
n = input()
num = 2
a={'0':0, '1':0}
for i in range(len(n)):
	if num != n[i]:
		a[n[i]] += 1
		num = n[i]
print(min(a.values()))