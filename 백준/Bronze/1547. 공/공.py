#공
m = int(input())
arr = [0, 1, 2, 3]

for _ in range(m):
	x, y = map(int, input().split())
	tmp = arr[x]
	arr[x] = arr[y]
	arr[y] = tmp
print(arr.index(1))