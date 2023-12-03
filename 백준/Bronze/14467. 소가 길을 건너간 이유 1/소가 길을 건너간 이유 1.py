n = int(input())
cows = []
cows_num = [0]*11
result = 0
for i in range(n):
    no, dir = map(int, input().split())
    if no not in cows:
        cows.append(no)
        cows_num[no] = dir
    else:
        if cows_num[no] != dir:
          result += 1
          cows_num[no] = dir

print(result)