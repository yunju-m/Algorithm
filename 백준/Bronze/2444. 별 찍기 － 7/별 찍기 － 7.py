#별찍기-7
n = int(input())
for i in range(1, n+1):
	print(' '*(n-i) + '*'*((2*i)-1))
for j in range(n-1, 0, -1):
	print(' '*(n-j)+'*'*((2*j)-1))