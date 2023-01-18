#비밀번호 찾기
import sys
input = sys.stdin.readline
n, m = map(int, input().split())
site = dict()

for _ in range(n):
	id, pw = map(str, input().split())
	site[id] = pw

for _ in range(m):
	address = str(input().rstrip())
	print(site[address])