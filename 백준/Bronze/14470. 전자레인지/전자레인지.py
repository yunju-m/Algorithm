#전자레인지
a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())
tmp = 0
if a < 0:
	tmp += abs(a)*c
	tmp += d
	tmp += b*e
else:
	tmp += (b-a)*e
print(tmp)