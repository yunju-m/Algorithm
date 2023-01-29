T = int(input())
for i in range(T):
	n = int(input())
	sums = 0
	arr = input().split()
	for num in arr:
		sums+=int(num)
	print(sums)