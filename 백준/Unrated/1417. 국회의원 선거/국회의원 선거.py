arr = [int(input()) for _ in range(int(input()))]
da = arr[0]
arr.pop(0)
cnt = 0

while True:
	if len(arr) == 0 or da > max(arr):
		break
	da += 1
	cnt += 1
	arr[arr.index(max(arr))]-=1
print(cnt)