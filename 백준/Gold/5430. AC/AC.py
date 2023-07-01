import sys
from collections import deque

T = int(input())

for _ in range(T):
	p = sys.stdin.readline().rstrip()
	n = int(input())
	arr = deque(sys.stdin.readline().rstrip()[1:-1].split(','))
	
	if n == 0:
		arr = deque()

	flag = 0

	for i in p:
		if i == 'R':
			flag += 1
		elif i == 'D':
			if len(arr)==0:
				print("error")
				break
			else:
				if flag % 2 == 0:
					arr.popleft()
				else:
					arr.pop()
	else:		
		if flag % 2 == 0:
			print("["+ ",".join(arr)+"]")
		else:
			arr.reverse()
			print("["+ ",".join(arr)+"]")