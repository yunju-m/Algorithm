import sys
sys.setrecursionlimit(2000)	#최대 재귀를 늘려줘야 런타임 에러를 피할 수 있다

def dfs(x):
	visited[x]=True
	number = numbers[x]
	if not visited[number]:
		dfs(number)

T=int(input())
for _ in range(T):
	n = int(input())
	numbers = [0] + list(map(int, input().split()))
	visited = [True] + [False] * n
	result = 0

	for i in range(1, n+1):
		if not visited[i]: 
			dfs(i)
			result += 1 
	print(result)