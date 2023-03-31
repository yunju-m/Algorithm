n = int(input())
a = [4]
f = 2
b = 1
sums = 0
for i in range(1, 16):
	f += b
	sums =  f**2
	a.append(sums)
	b = b*2
print(a[n])