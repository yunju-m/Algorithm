#잃어버린괄호
s = list(input().split('-'))
arr = []
for i in s:
	cnt = 0
	st = i.split('+')
	for j in st:
		cnt += int(j)
	arr.append(cnt)

sums = arr[0]
for i in range(1, len(arr)):
	sums -= arr[i]
print(sums)