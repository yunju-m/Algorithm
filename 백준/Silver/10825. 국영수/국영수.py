#국영수
n = int(input())
students = []
for i in range(n):
	students.append(input().split())
students.sort(key = lambda x: (-int(x[1]), int(x[2]), -int(x[3]), x[0]))
for st in students:
	print(st[0])