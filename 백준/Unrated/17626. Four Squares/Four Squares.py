import math

n = int(input())
dp = [0, 1]

for i in range(2, n+1):
	mins = 1e9
	for j in range(1, int(math.sqrt(i))+1):
		mins = min(mins, dp[i-j**2])
	dp.append(mins+1)
print(dp[n])