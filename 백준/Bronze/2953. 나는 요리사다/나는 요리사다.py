#나는 요리사다
score = []
for i in range(5):
	s1, s2, s3, s4 = map(int, input().split())
	score.append(s1+s2+s3+s4)
print(score.index(max(score))+1, max(score))