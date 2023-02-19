line = input()
s = input()
cnt = 0
i = 0

while i <= len(line)-len(s):
	if line[i:i+len(s)] == s:
		cnt+=1
		i+=len(s)
	else:
		i+=1
print(cnt)