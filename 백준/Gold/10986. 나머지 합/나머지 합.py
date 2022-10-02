#나머지 합
n, m = map(int, input().split())
arr = list(map(int, input().split()))+[0]
result = [0]*m

for i in range(n):
	arr[i] += arr[i-1]
	result[arr[i]%m] += 1

ans = result[0]

for i in result:
	ans += i * (i-1) // 2
print(ans)