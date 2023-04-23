arr = [i * (i+1) // 2 for i in range(1, 50)]
result = [0]*1001

for i in arr:
	for j in arr:
		for k in arr:
			if i+j+k <= 1000:
				result[i+j+k] = 1

t = int(input())
for _ in range(t):
	print(result[int(input())])