n = int(input())
enemy = list(map(int, input().split()))
result = 0
cnt = 0
start = enemy[0]
for i in range(1, n):
    if start < enemy[i]:
        start = enemy[i]
        result = cnt
        cnt = 0
    else:
        cnt+=1
        if result < cnt:
            result = cnt
print(result)