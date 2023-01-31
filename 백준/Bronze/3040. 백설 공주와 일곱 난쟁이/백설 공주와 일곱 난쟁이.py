arr = [int(input()) for _ in range(9)]
fin = False
for i in range(8):
	if fin:
		break
	for j in range(i+1, 9):
		if sum(arr)-arr[i]-arr[j] == 100:
			arr.pop(j)
			arr.pop(i)
			fin = True
			break
for n in arr:
	print(n)