n, m = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()	# 오름차순으로 출력해야하므로 정렬해준다.
visited = [False] * n
temp = []

def dfs():
	if len(temp) == m:
		print(*temp)	# 배열에 원소 값만 출력
		return
	cnt = 0
	for i in range(n):
		if not visited[i] and cnt != arr[i]:
			visited[i] = True
			temp.append(arr[i])
			cnt = arr[i]
			dfs()
			visited[i] = False
			temp.pop()
dfs()