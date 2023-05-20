N, C = map(int, input().split())
arr = list(map(int, input().split()))
count ={}
index = 1
for a in arr:
	if a in count:
		count[a][0] += 1
	else:
		count[a] = [1, index]
		index += 1

numbers = [[i, j] for i, j in count.items()]
numbers.sort(key=lambda x:(-x[1][0], x[1][1]))
res=[]
for i, j in numbers:
	res += [i]*j[0]
print(*res)