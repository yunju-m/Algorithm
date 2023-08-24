import math
n = int(input())
result = math.trunc(n**(1/2))
if result**2 >= n:
	print(result)
else:
	print(result+1)