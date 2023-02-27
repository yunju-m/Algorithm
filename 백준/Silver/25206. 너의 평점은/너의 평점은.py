def rate(level):
	if level == 'A+':
		return 4.5
	elif level == 'A0':
		return 4.0
	elif level == 'B+':
		return 3.5
	elif level == 'B0':
		return 3.0
	elif level == 'C+':
		return 2.5
	elif level == 'C0':
		return 2.0
	elif level == 'D+':
		return 1.5
	elif level == 'D0':
		return 1.0
	elif level == 'F':
		return 0.0 

total = 0
result = 0
for i in range(20):
	subject, score, level = map(str, input().split())
	if level != 'P':
		total += float(score)
		result += rate(level)*float(score)
print(round(result/total, 6))