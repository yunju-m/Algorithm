#피보나치 수2
def fib(n):
	arr = [0, 1]
	if n < 2:
		return arr[n]
	else:
		for i in range(2, n+1):
			arr.append(arr[i-1] + arr[i-2])
		return arr[n]

n = int(input())
print(fib(n))