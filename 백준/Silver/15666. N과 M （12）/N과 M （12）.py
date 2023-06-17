n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
temp = []

def dfs(start):
	if len(temp) == m:
		print(*temp)
		return
	remember = 0
	for i in range(start, n):
		if remember != arr[i]:
			temp.append(arr[i])
			remember = arr[i]
			dfs(i)
			temp.pop()
dfs(0)