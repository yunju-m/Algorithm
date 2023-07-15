import sys
input = sys.stdin.readline

n = int(input())
tips = [int(input()) for _ in range(n)]
tips.sort(reverse = True)
result = 0

for i in range(1, n+1):
	res_tip = tips[i-1] - (i-1)
	if res_tip > 0:
		result += res_tip
print(result)