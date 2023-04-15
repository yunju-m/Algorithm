n = int(input())
arr = list(map(int, input().split()))
arr.sort(reverse=True)

maxDay = 1
day = n
for i in range(n):
	maxDay = max(arr[i]-day+1, maxDay)
	day-=1
print(n+maxDay+1)