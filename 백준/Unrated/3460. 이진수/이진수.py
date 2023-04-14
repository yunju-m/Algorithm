for i in range(int(input())):
	n = int(input())
	result = int(format(n, 'b'))
	cnt = 0
	while result != 0:
		num = result%10
		result = result // 10
		if num == 1:
			print(cnt, end=" ")
		cnt+=1