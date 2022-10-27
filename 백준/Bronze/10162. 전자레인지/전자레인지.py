#전자레인지
A = 300
B = 60
C = 10

T = int(input())
if T%10 == 0:
	print(T//A, end=" ")
	T = T%A
	print(T//B, end=" ")
	T = T%B
	print(T//C)
	T = T%C
else:
	print(-1)