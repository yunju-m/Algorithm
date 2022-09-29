# 행렬 곱셈
def solution(arr1, arr2):
	result = [len(arr2[0])*[0] for i in range(len(arr1))]
	for i in range(len(result)):
		for j in range(len(result[i])):
			for k in range(len(arr1[i])):
				result[i][j] += arr1[i][k] * arr2[k][j]
	return result

an, am = map(int, input().split())
A = [list(map(int, input().split())) for _ in range(an)]
bn, bm = map(int, input().split())
B = [list(map(int, input().split())) for _ in range(bn)]
result = solution(A, B)

for i in range(an):
	for j in range(bm):
		print(result[i][j], end=" ")
	print()