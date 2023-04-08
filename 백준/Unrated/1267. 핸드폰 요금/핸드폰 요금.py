n = int(input())
call = list(map(int, input().split()))
Y = 0
M = 0

for i in range(n):
	Y += (call[i]//30+1)*10
	M += (call[i]//60+1)*15

if Y < M:
	print("Y", Y)
elif M < Y:
	print("M", M)
else:
	print("Y M", Y)