n = int(input())
arr = list(map(int, input().split()))
arr.sort()
x = int(input())

cnt = 0
left, right = 0, n-1

while left < right:
	tmp = arr[left]+arr[right]
	if tmp==x:
		cnt+=1
	if tmp<x:
		left+=1
	else:
		right-=1
print(cnt)