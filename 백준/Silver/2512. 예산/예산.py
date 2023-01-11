#예산
import sys
input = sys.stdin.readline
t = int(input())
budget = list(map(int, input().split()))
n = int(input())

start, end = 0, max(budget)

while start <= end:
	mid = (start+end)//2
	total_budget = 0
	for i in budget:
		total_budget += min(mid, i)

	if total_budget > n:
		end = mid - 1
	else:
		start = mid + 1
print(end)