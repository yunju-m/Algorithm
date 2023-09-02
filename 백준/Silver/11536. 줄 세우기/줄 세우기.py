N = int(input())
names = []
re_names = []
for i in range(N):
	name = input()
	names.append(name)
	re_names.append(name)

sort_names = sorted(names)
re_names.sort(reverse=True)

if names == sort_names:
	print("INCREASING")
elif names == re_names:
	print("DECREASING")
else:
	print("NEITHER")
