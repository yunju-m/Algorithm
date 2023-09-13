import sys
input = sys.stdin.readline

N = int(input())
standing = list(map(int, input().split()))
stack = []
cnt = 1

while(standing):
	if standing[0] == cnt:
		standing.pop(0)
		cnt += 1
	else:
		stack.append(standing.pop(0))
	
	while stack:
		if stack[-1] == cnt:
			stack.pop()
			cnt += 1
		else:
			break

if not stack:
	print("Nice")
else:
	print("Sad")