N, M = map(int, input().split())
packet = [num+1 for num in range(N)]

for _ in range(M):
	i, j = map(int, input().split())
	packet = packet[:i-1] + packet[i-1:j][::-1] + packet[j:]

for i in packet:
	print(i, end=' ')