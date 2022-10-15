#최소 힙
import heapq
import sys
input = sys.stdin.readline
n = int(input())
arr = []
for _ in range(n):
	x = int(input())
	if x == 0:
		if len(arr) == 0:
			print(0)
		else:
			print(heapq.heappop(arr))
	else:
		heapq.heappush(arr, x)