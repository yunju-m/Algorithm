#접미사 배열
s = input()
arr = []
for i in range(0, len(s)):
	arr.append(s[i:])
arr = sorted(arr)
for a in arr:
	print(a)