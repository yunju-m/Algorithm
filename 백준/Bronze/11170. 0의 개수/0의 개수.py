T = int(input())
for tc in range(T):
    N, M = map(int, input().split())
    cnt = 0
    for num in range(N, M+1):
        while True:
            if num % 10 == 0:
                cnt += 1
            num = num // 10
            if num == 0:
                break
    print(cnt)