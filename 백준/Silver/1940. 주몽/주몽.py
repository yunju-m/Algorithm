n = int(input())
m = int(input())
nums = list(map(int, input().split()))
nums.sort()
cnt = 0
i, j = 0, n-1
while i < j:
	if nums[i] + nums[j] == m:
		cnt += 1
		i += 1
		j -= 1
	elif nums[i] + nums[j] < m:
		i += 1
	else:
		j -= 1

print(cnt)