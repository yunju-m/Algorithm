import math
t = int(input())

for i in range (0, t):
	arr = list(map(int, input().split()))
	gcd = 0
	for j in range (1, len(arr)):
		for k in range(j+1, len(arr)):
			gcd += math.gcd(arr[j], arr[k])			
	print(gcd)