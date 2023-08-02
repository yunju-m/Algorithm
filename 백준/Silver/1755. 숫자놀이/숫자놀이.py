alpha = {'1':"one", '2':"two", '3':"three", '4':"four", '5':"five", '6':"six", '7':"seven", '8':"eight", '9':"nine", '0':"zero"}
n, m = map(int, input().split())

result = []
for i in range(n, m+1):
	n_alpha = ' '.join([alpha[j] for j in str(i)])
	result.append([i, n_alpha])

result.sort(key=lambda x:x[1])

for i in range(len(result)):
	if i % 10 == 0 and i != 0:
		print("")
	print(result[i][0], end=" ")