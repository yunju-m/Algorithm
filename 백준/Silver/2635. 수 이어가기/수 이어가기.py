n = int(input())
result = []
for i in range(n+1):
	arr = [n]	
	arr.append(i)
	
	idx = 1
	while True:
		num = arr[idx-1] - arr[idx]
		if num < 0:
			break
		arr.append(num)
		idx += 1

	if len(result) < len(arr):
		result = arr
print(len(result))
print(*result)