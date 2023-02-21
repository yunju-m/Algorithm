N, L = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()
start = arr[0]
cnt = 1

for location in arr[1:]:
	if location in range(start, start+L):
		continue
	else:
		start = location
		cnt += 1
print(cnt)