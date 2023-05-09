arr = []
a, p = map(int, input().split())
cnt = 0
arr.append(a)
while True:
	sums=0
	num = arr[cnt]
	while num != 0:
		na = num%10
		num = num//10
		sums += (na**p)
	if sums in arr:
		print(arr.index(sums))
		break
	arr.append(sums)
	cnt+=1