#별찍기 - 3
n = int(input())
cnt = n
for i in range(n):
	for j in range(cnt):
		print("*", end='')
	cnt-=1
	print(end='\n')