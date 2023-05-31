import sys
input = sys.stdin.readline

def back_tracking(cnt, idx):
	if cnt == l:
		vo, co = 0, 0

		for i in range(l):
			if result[i] in mo:
				vo += 1
			else:
				co += 1

		if vo >= 1 and co >= 2:
			print(''.join(result))
		return

	for i in range(idx, c):
		result.append(word[i])
		back_tracking(cnt+1, i+1)
		result.pop()

l, c = map(int, input().split())
word = sorted(list(input().split()))
mo = ['a','e','i','o','u']
result = []
back_tracking(0, 0)
