import sys
input = sys.stdin.readline

n, m = map(int, input().split())
if n > 0:
	books = list(map(int, input().split()))
	b_weight = 0
	box = 0
	for b in books:
		b_weight += b
		if b_weight == m:
			box += 1
			b_weight = 0
		elif b_weight > m:
			box += 1
			b_weight = b
	if b_weight:
		box += 1
	print(box)
else:
	print(0)