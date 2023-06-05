import sys
input = sys.stdin.readline

for _ in range(int(input())):
	n = int(input())
	num = 2

	arr = {}
	for i in range(n+1):
		arr[i] = 0

	while True:
		if n == 1:
			break

		if n % num != 0:
			num += 1
		else:
			n = n/num
			arr[num] += 1

	for i in arr.items():
		if i[1] != 0:
			print(i[0], i[1])