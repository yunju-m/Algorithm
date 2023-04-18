arr = [int(input()) for _ in range(10)]
sums = 0
for i in arr:
	sums += i
	if sums >= 100:
		bsums = sums-i
		sums = bsums if 100-bsums < abs(100-sums) else sums
		break
print(sums)
