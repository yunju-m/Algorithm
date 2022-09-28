#알파벳 개수
alt = [0]*26 	# 0을 총 26개로 초기화
s = input()
for i in s:
	alt[ord(i)-97] += 1
for i in alt:
	print(i, end=' ')