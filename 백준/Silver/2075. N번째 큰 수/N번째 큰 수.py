import heapq

heap = []
n = int(input())

for _ in range(n):
	arr = map(int, input().split())
	for a in arr:
		if len(heap) < n:
			heapq.heappush(heap, a)
		else:
			if heap[0] < a:
				heapq.heappop(heap)
				heapq.heappush(heap, a)
print(heap[0])