from itertools import combinations_with_replacement

I, V, X, L = 1, 5, 10, 50
n = int(input())
nums = [1, 5, 10, 50]
result = set()

for temp in combinations_with_replacement(range(4), n):
	sums = 0
	for i in temp:
		sums += nums[i]
	result.add(sums)
print(len(result))