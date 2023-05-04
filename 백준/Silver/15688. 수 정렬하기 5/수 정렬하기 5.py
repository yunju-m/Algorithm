import sys
N = int(input())
arr = []
for i in range(N):
	arr.append(int(sys.stdin.readline()))

for i in sorted(arr):
	print(i)