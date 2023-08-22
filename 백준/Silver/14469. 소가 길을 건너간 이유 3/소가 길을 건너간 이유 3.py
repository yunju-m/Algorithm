n = int(input())
arr = []
for i in range(n):
	arr.append(list(map(int, input().split())))
	
arr.sort(key=lambda x : (x[0], x[1]))
result = 0

for i in range(n):
	if arr[i][0] >= result:
		result = arr[i][0] + arr[i][1]
	else:
		result += arr[i][1]
print(result)