#알고리즘 수행 시간은 O(n^2)이므로 항상 2을 출력한다.
def MenOfPassion(n):
	print(n*(n-1)//2)
	print(2)

n = int(input())
MenOfPassion(n)