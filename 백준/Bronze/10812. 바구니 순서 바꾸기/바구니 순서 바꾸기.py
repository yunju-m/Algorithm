N, M = map(int, input().split())
packet = [num+1 for num in range(N)]

for i in range(M):
	begin, end, mid = map(int, input().split())
	packet = packet[:begin-1]+packet[mid-1:end]+packet[begin-1:mid-1]+packet[end:]

for req in packet:
	print(req, end=" ")