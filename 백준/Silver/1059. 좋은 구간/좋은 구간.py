import sys
input = sys.stdin.readline

L = int(input())
nums = list(map(int, input().split()))
n = int(input())
nums.sort()

if n in nums:
	print(0)
else:
	mins = 0
	maxs = 0
	for num in nums:
		if num < n:
			mins = num
		elif num > n and maxs == 0:
			maxs = num
	maxs -= 1
	mins += 1
	print((n-mins)*(maxs-n+1)+(maxs-n))