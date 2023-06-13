import sys
input = sys.stdin.readline

def dfs(depth):
	if depth == k:
		setarr.add("".join(map(str, arr)))
		return ;
	for i in range(n):
		if check[i]:
			continue
		arr.append(cards[i])
		check[i] = 1
		dfs(depth+1)
		arr.pop()
		check[i] = 0

n = int(input())
k = int(input())
cards = [int(input()) for _ in range(n)]
check = [0]*n
arr, setarr = [], set()
dfs(0)
print(len(setarr))

