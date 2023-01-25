N = int(input())
d = {}
for i in range(N):
	s = input()
	if s in d.keys():
		d[s] = d.get(s)+1
	else:
		d[s] = 1

d = dict(sorted(d.items()))
for k in d.keys():
	if max(d.values()) == d.get(k):
		result = k
		break
print(k)