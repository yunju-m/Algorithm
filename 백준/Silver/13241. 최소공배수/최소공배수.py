#유클리드 호제법
#최소공배수 구하기
def GCD(x,y):
	while(y):
		x,y = y, x%y
	return x
def LCM(x,y):
	result = (x*y)//GCD(x,y)
	return result
a, b = map(int, input().split())
print(LCM(a,b))