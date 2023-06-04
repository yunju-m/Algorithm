import sys
input = sys.stdin.readline

arr = list(input().rstrip())
arr2 = []

N = int(input())
for _ in range(N):
	s = list(input().split())
	if s[0] == 'L':
		if arr:
			arr2.append(arr.pop())
	elif s[0] == 'D':
		if arr2:
			arr.append(arr2.pop())
	elif s[0] == 'B':
		if arr:
			arr.pop()
	else:
		arr.append(s[1])


arr.extend(reversed(arr2))
print(''.join(arr))
