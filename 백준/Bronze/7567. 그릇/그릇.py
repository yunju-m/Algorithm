dish = list(str(input()))
total = 0
for i in range(len(dish)):
	if i == 0:
		total = 10
	elif dish[i] == dish[i-1]:
		total += 5
	else:
		total += 10
print(total)