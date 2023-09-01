arr = list(map(int, input().split()))
notok = True
while notok:
	for i in range(1, len(arr)):
		if arr[i-1] > arr[i]:
			temp = arr[i-1]
			arr[i-1] = arr[i]
			arr[i] = temp
			print(*arr)
	for i in range(len(arr)):
		if (i+1) != arr[i]:
			notok = True
			break
		else:
			notok = False
