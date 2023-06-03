def fibo(n):
	dp=[0, 1]
	if n < 2:
		return dp[n]
	for i in range(2, n+1):
		dp.append((dp[i-1]+dp[i-2]) % 1000000000)
	return dp[n]


n = int(input())
if n % 2 == 0 and n < 0:
	print(-1)
elif n == 0:
	print(0)
else:
	print(1)
print(fibo(abs(n)))