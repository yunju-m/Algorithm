N, M = map(int, input().split())
packet = [num for num in range(N+1)]
for _ in range(M):
	i, j = map(int, input().split())
	tmp = packet[i]
	packet[i] = packet[j]
	packet[j] = tmp

for i in range(1, N+1):
	print(packet[i], end=' ')