while True:
	try:
		n = int(input())
	except:
		break
	result = 0
	cnt = 1
	while True:
		result = result*10+1
		result = result % n
		if result == 0:
			print(cnt)
			break
		cnt+=1