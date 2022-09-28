# 약수 구하기
n, k = map(int, input().split())
cnt = 0
for i in range(n):
	if n % (i+1) == 0:
		cnt+=1
		if (cnt == k):
			print(i+1)
			break
if cnt != k:
	print(0)