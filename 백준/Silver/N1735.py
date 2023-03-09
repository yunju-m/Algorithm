from fractions import Fraction
a, b = map(int, input().split())
c, d = map(int, input().split())

def fsum(a, b, c, d):
	global mole, deno
	if b == d:
		deno = b
		mole = a+c
	else:
		deno = b*d
		mole = a*d+c*b
	result = Fraction(mole, deno)
	return result

result = fsum(a, b, c, d)
print(result.numerator, end=' ')
print(result.denominator)