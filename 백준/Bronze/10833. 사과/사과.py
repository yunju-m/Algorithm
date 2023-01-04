n = int(input())
r = 0
for i in range(n):
	st, apple = map(int, input().split())
	r += apple % st
print(r)