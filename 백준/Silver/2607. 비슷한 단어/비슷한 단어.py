N = int(input())
target = list(input())
result = 0

for _ in range(1, N):
	compare = target[:]
	word = input()
	cnt = 0
	for w in word:
		if w in compare:
			compare.remove(w)
		else:
			cnt+=1
	if cnt < 2 and len(compare) < 2:
		result += 1
print(result)