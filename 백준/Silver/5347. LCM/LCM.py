# 최대공약수
def gcd(x, y):
	while(y):
		x,y = y, x%y		
	return x

# 최소공배수
def lcm(x, y):
	result = (x*y)//gcd(x, y)
	return result

n = int(input())
for _ in range(n):
	a, b = map(int, input().split())
	print(lcm(a,b))