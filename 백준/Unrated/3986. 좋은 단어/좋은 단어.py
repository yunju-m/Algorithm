arr = [input() for i in range(int(input()))]
ans = 0
for AB in arr:
	stack = []
	for ab in AB:
		if len(stack) == 0:
			stack.append(ab)
		else:
			if ab == 'A':
				if stack[-1] == 'B':
					stack.append(ab)
				elif stack[-1] == 'A':
					stack.pop()
			elif ab == 'B':
				if stack[-1] == 'A':
					stack.append(ab)
				elif stack[-1] == 'B':
					stack.pop()
	if len(stack) == 0:
		ans += 1

print(ans)