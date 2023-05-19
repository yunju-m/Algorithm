N, K = map(int, input().split())
arr = list(input())
cnt = 0

for i in range(N):
	if arr[i] == 'P':
		for j in range(max(i-K, 0), min(i+K+1, N)):
			if arr[j] == 'H':
				arr[j] = 0
				cnt+=1
				break
print(cnt)