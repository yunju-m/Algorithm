#중복 빼고 정렬하기
n = int(input())
arr = map(int, input().split())
result = list(set(arr))
result.sort()
for i in result:
	print(i, end = " ")