import sys
input = sys.stdin.readline

n = int(input())
product = [int(input()) for _ in range(n)]
product.sort(reverse=True)
price = 0

for i in range(2, n, 3):
	price += product[i]

print(sum(product) - price)