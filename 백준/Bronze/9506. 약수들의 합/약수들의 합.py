result = []
total = 0
while(True):
	n = int(input())
	if n == -1:
		break
	else:
		for div in range(1, n):
			if n % div == 0:
				result.append(div)
		for num in result:
			total += num
		if total == n:
			print("%d = " %n, end='')
			for i in range(len(result)):
				if i == len(result)-1:
					print(result[i])
				else:
					print(result[i], end=' + ')
		else:
			print("%d is NOT perfect." %n)
		result = []	
		total = 0