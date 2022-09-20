# ATM
n = int(input())
people = list(map(int, input().split()))
people.sort()
sums = 0
total = 0
for i in range(n):
	sums += people[i]
	total += sums
print(total)
