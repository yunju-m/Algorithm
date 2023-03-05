# 알고리즘 수행시간은 O(n^3)이므로 항상 3을 출력
def MenOfPassion(n):
	print(n*(n-1)*(n-2)//6)
	print(3)

n = int(input())
MenOfPassion(n)