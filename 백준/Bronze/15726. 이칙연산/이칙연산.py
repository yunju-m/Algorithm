#이칙연산
a, b, c = map(int, input().split())
if b > c:
	print(a*b//c)
elif c > b:
	print(a*c//b)