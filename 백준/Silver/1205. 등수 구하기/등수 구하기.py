import sys
input = sys.stdin.readline

p, score, nscore = map(int,  input().split())

if p == 0:
	print(1)
else:
	total_score = list(map(int, input().split()))
	cnt = 1
	if score <= total_score[p-1] and p == nscore:
		print(-1)
	else:
		out = True
		for s in total_score:
			if score >= s:
				print(cnt)
				out = False
				break
			else:
				cnt+=1
		if out:
			print(cnt)