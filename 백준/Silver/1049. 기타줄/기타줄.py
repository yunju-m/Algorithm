n, m = map(int, input().split())

answer = 0
price_list = []

for _ in range(m):
	price = tuple(map(int, input().split()))
	price_list.append(price)

package = sorted(price_list, key=lambda x : x[0])
one = sorted(price_list, key=lambda x : x[1])

if package[0][0] <= one[0][1] * 6:
	answer = package[0][0] * (n//6) + one[0][1] * (n%6)
	if package[0][0] < one[0][1] * (n%6):
		answer = package[0][0] * (n//6+1)
else:
	answer = one[0][1]*n

print(answer)