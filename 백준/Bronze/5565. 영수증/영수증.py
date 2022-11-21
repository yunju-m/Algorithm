#영수증
total = int(input())
money = 0
for i in range(9):
	money += int(input())
print(total-money)