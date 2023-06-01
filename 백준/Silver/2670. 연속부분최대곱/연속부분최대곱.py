N = int(input())
arr = list(float(input()) for _ in range(N))

for i in range(1, N):
	arr[i] = max(arr[i-1] * arr[i], arr[i])
print("{:.3f}" .format(max(arr)))