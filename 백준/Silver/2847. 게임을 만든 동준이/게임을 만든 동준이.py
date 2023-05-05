import sys
N = int(input())
score = []
for i in range(N):
	score.append(int(sys.stdin.readline()))

cnt = 0
for i in range(1, N):
	if score[i-1] >= score[i]:
		while True:
			if score[i-1] < score[i]:
				if i == 1:
					break
				else:
					i-=1
			else:
				score[i-1] -= 1
				cnt+=1
print(cnt)