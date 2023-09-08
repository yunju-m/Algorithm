import sys
input = sys.stdin.readline

N = int(input())
stack = []
for i in range(N):
	n = input().split()
	if n[0] == '1':
		stack.append(int(n[1]))
	elif n[0] == '2':
		if stack:
			p = stack.pop()
			print(p)
		else:
			print(-1)
	elif n[0] == '3':
		print(len(stack))
	elif n[0] == '4':
		if len(stack) == 0:
			print(1)
		else:
			print(0)
	elif n[0] == '5':
		if stack:
			print(stack[len(stack)-1])
		else:
			print(-1)