import sys

while True:
	s = sys.stdin.readline().rstrip("\n")
	if not s:	# 아무것도 입력하지 않은 경우
		break

	so, de, num, bln = 0, 0, 0, 0
	for i in s:
		if i >= 'a' and i <= 'z':
			so += 1
		elif i >= 'A' and i <= 'Z':
			de += 1
		elif i == ' ':
			bln +=1
		else:
			num+=1
	print(so, de, num, bln)