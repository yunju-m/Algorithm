T = int(input())
for tc in range(1, T + 1):
    N = int(input())
    arr = list(map(int, input().split()))
    total = 0
    cnt = 0
    for i in range(N):
        total += arr[i]
    total = total//N
    for i in range(N):
        if arr[i] <= total:
            cnt += 1
    print("#{} {}".format(tc, cnt))