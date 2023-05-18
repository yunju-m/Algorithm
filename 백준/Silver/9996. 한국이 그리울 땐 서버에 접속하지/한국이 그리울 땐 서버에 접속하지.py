N = int(input())
pattern = list(input().split('*'))
for i in range(N):
	s = input().strip()
	if len(s) >= len(pattern[0]) + len(pattern[-1]):
		if s[:len(pattern[0])] == pattern[0] and s[-len(pattern[-1]):] == pattern[-1]:
			print('DA')
		else:
			print('NE')
	else:
		print('NE')