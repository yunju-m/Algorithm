#피보나치 수 - 동적 계획법
def fib(n):
	val = [0, 1]
	if n < 2:
		return val[n]
	else:
		for i in range(2, n+1):
			val.append(val[i-1] +val[i-2])
		return val[n]
n = int(input())
print(fib(n))