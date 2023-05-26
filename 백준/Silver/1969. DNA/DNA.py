N, M = map(int, input().split())
dna = [input() for _ in range(N)]
alpha = [chr(x) for x in range(65, 91)]
cnt = [0]*27
result = ''
hd = 0

for i in range(M):
	for j in range(N):
		cnt[alpha.index(dna[j][i])]+=1
	result += alpha[cnt.index(max(cnt))]
	hd += N-max(cnt)
	cnt = [0]*27
print(result)
print(hd)