#일곱난쟁이
arr = []
for i in range(9):
	arr.append(int(input()))
arr = sorted(arr)

for i in range(len(arr)):
	for j in range(i+1, len(arr)):
		sums = arr[i] + arr[j]
		if (sum(arr) - sums == 100):
			nan1 =  arr[i]
			nan2 =  arr[j]
arr.remove(nan1)			
arr.remove(nan2)
for i in arr:
    print(i)