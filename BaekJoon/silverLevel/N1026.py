#1026 보물
N = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
a.sort()
b.sort()

sums = 0
for i in range(N):
	sums += a[i]*b[N-1-i]
print(sums)