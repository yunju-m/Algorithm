N = int(input())
dp = [0]*1001
dp[1], dp[2], dp[3], dp[4] = 'SK', 'CY', 'SK', 'SK'
stone = [1, 3, 4]

for i in range(5, N+1):
	for s in stone:
		if dp[i-s] == 'CY':
			dp[i] = 'SK'
			break
		dp[i] = 'CY'
print(dp[N])