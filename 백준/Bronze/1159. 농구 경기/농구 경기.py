from collections import Counter
n = int(input())
player = []
name = []
cnt = 0

for i in range(n):
	a = input()
	player.append(a[0])

pcnt = Counter(player)
for i, j in pcnt.items():
	if j >= 5:
		name.append(i)
		cnt+=1
name.sort()
if cnt == 0:
	print("PREDAJA")
else:
	for i in name:
		print(i, end="")