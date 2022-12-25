import sys
n = int(sys.stdin.readline().rstrip())
sums = 0
for i in range(n):
	sums += int(sys.stdin.readline().rstrip())
	sums -= 1
print(sums+1)