#열개씩 끊어 출력하기
n = input()
cnt = 0
s = ''
for i in n:
	s += i
	cnt+=1
	if cnt == 10:
		print(s)
		cnt = 0
		s = ''
print(s)