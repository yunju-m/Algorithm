def fibo(n):
	dp = [1, 1, 2, 4]
	if n <= 3:
		return dp[n]
	else:
		for i in range(4, n+1):
			dp.append(dp[i-1] + dp[i-2] + dp[i-3] + dp[i-4])
		return dp[n]

t = int(input())
for _ in range(t):
	print(fibo(int(input())))