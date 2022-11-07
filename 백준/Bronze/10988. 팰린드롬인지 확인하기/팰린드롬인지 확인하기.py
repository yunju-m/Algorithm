#팰린드롬인지 확인하기
s = input()
rs = s[::-1]
if s == rs:
	print(1)
else:
	print(0)