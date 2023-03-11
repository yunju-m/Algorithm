k = int(input())

for i in range(k):
	score = list(map(int, input().split()))
	del score[0]
	score.sort()
	diff = []
	print("Class", i+1)
	
	for i in range(len(score)-1):
		diff.append(score[i+1] - score[i])

	print('Max', str(max(score)) + ', Min', str(min(score)) + ', Largest gap', max(diff))