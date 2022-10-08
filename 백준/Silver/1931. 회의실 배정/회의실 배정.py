#회의실 배정
n = int(input())
arr = []
for i in range(n):
	first, end = map(int, input().split())
	arr.append([first, end])
arr = sorted(arr, key=lambda a:a[0])
arr = sorted(arr, key=lambda a:a[1])

last = 0
cnt = 0
for i, j in arr:
	if i>= last:
		cnt += 1
		last = j
print(cnt)