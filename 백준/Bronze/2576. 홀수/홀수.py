# 홀수
result = 0
arr=[]
for i in range(7):
	n = int(input())
	if n%2!=0:
		result+=n
		arr.append(n)
if (result==0):
	print(-1)
else:
	print(result)
	print(min(arr))