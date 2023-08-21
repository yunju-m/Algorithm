A = input()
B = input()
arr = [
  3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1
]
result = []
index = 1
for a in A:
  result.append(arr[ord(a) - 65])
for b in B:
  result.insert(index, arr[ord(b) - 65])
  index += 2

while len(result) != 2:
  for i in range(1, len(result)):
    sum = result[i - 1] + result[i]
    if sum >= 10:
      sum = sum % 10
    result[i-1] = sum
  result.pop()

for r in result:
  print(r, end='')
