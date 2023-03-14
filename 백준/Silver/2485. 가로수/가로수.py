import sys
from math import gcd

n = int(sys.stdin.readline()) # 가로수 개수
a = int(sys.stdin.readline()) # 첫 번째 가로수

arr = []
for i in range(n-1):
	num = int(sys.stdin.readline())
	arr.append(num-a)
	a = num

# 가로수 간격이 일정하게 배치하는 간격 -> 최대공약수
g = arr[0]
for j in range(1, len(arr)):
	g = gcd(g, arr[j])

result = 0
for cnt in arr:
	result += cnt // g - 1
print(result)