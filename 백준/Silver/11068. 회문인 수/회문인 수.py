n = int(input())
for i in range(n):
	a =  int(input())
	ans = []
	for j in range(2, 65):
		li = []
		temp = a
		while temp != 0:
			li.append(temp%j)
			temp = temp//j

		for k in range(len(li)//2):
			if (li[k] != li[-1-k]):
				ans.append('X')
				break
	if len(ans) == 63:
		print(0)
	else:
		print(1)