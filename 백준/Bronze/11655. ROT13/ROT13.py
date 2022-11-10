s = input()
res = ''
for i in range(len(s)):
	if s[i] == ' ' or ord(s[i]) < ord('A'):
		res += s[i]
	else:
		if ord(s[i]) + 13 > 122:
			res += chr(ord(s[i]) - 13)
		elif ord(s[i]) + 13 > 90 and ord(s[i]) < 91:
			res += chr(ord(s[i]) - 13)
		else:
			res += chr(ord(s[i]) + 13)
print(res)
