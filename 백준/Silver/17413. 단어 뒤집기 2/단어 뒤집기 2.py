s = list(input())
end = False
word = ''
r_word = ''

for i in s:
	if end == False:
		if i == '<':
			r_word += word[::-1]
			word=''
			end = True
			word += i
		elif i == ' ':
			r_word += word[::-1]
			r_word += i
			word = ''
		else:
			word += i
	elif end == True:
		word += i
		if i == '>':
			end = False
			r_word += word
			word = ''
print(r_word+word[::-1])