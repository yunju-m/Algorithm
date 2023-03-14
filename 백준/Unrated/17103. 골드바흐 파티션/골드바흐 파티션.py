import sys
input = sys.stdin.readline

def get_primary_list(n):
	arr = [1 for _ in range(n+1)]

	for i in range(2, int(n**0.5) + 1):
		if arr[i]:
			j = 2
		while i * j <= n:
			arr[i*j] = 0
			j += 1
	return arr

t = int(input())
nums = [int(input()) for _ in range(t)]
max_num = max(nums)
primarys = get_primary_list(max_num)

for num in nums:
	result = 0

	for i in range(2, num // 2 + 1):
		if primarys[i] and primarys[num-i]:
			result += 1

	print(result)