import sys

input = sys.stdin.readline

numbers = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0']
result = []
n = int(input())
for _ in range(n):
  letter = input()
  tmp = []
  sums = ""

  for le in letter:
    if le in numbers:
      sums += le
    else:
      if sums:
        tmp.append(int(sums))
        sums = ""
  if sums:
    tmp.append(int(sums))
  result += tmp

result.sort()
for r in result:
  print(r)
