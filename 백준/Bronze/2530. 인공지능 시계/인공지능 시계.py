#인공지능 시계
A,B,C = map(int, input().split())
time = int(input())
B += time//60
C += time%60
if(C >= 60):
	B += C//60
	C = C%60
if(B >= 60):
	A += B//60
	B = B%60
if (A >= 24):
	A = A % 24
print(A, B, C)