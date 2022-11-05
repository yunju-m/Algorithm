#회사에 있는 사람
import sys
input = sys.stdin.readline
n = int(input())
work = dict()
for i in range(n):
	n, w = map(str, input().split())
	if w == 'enter':
		work[n] = 1
	elif w == 'leave':
		del work[n]
work = sorted(work.keys(), reverse=True)
for k in work:
	print(k)