
arr = []
avg = 0
for i in range(5):
	n = int(input())
	avg += n
	arr.append(n)
arr.sort()
print(avg//5)
print(arr[2])