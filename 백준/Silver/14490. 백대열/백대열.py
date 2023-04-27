def gcd(a, b):
	while b > 0:
		a, b = b, a%b
	return a

n, m = map(int, input().split(':'))
gcd = gcd(n, m)
print(f'{n//gcd}:{m//gcd}')
