n = int(input())
for i in range(n):
	r, e, c = map(int, input().split())
	total = e-c
	if r < total:
		print("advertise")
	elif r == total:
		print("does not matter")
	else:
		print("do not advertise")
