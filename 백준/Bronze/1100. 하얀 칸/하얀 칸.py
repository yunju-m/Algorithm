#하얀칸
arr = []
for i in range(8):
	s = input()
	arr.append(list(map(str, list(s))))
cnt = 0

for i in range(len(arr)):
	for j in range(i%2, len(arr), 2):
		if arr[i][j] == 'F':
			cnt+=1
print(cnt)