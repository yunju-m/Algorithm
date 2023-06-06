import sys
input = sys.stdin.readline

K, L = map(int, input().split())
dt = dict()
for i in range(L):
	number = input().rstrip()
	dt[number] = i

dt = sorted(dt.items(), key=(lambda x: x[1]))

cnt=0
for i in dt:
	if cnt == K:
		break
	print(i[0])
	cnt+=1