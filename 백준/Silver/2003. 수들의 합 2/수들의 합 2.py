#수들의 합2
n, m = map(int, input().split())
arr = list(map(int, input().split()))

start = 0
end = 0
cnt = 0

while not (start == end == n):
	sums = sum(arr[start:end])
	if sums < m and end < n:
		sums += arr[end]
		end += 1
	else:
		sums -= arr[start]
		start += 1
	if sums == m:
		cnt+=1
print(cnt)