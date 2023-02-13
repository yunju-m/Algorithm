n = int(input())
arr = [1, 1]
if n >= 2:
	for i in range(n):
		num = arr[i]+arr[i+1]
		arr.append(num)
tile_round = (arr[n-1] + arr[n])*2

print(tile_round)