import sys
input = sys.stdin.readline

cnt = 0
while True:
	L, P, V = map(int, input().split())
	if L+P+V==0:
		break
	else:
		vacation = 0
		vacation += L*(V//P)
		vacation += min((V%P), L)
		cnt += 1
		print(f"Case {cnt}: {vacation}")