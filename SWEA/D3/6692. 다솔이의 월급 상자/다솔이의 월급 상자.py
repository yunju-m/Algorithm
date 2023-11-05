T = int(input())
for tc in range(1, T+1):
    N = int(input())
    result = 0
    for i in range(N):
        p, x = map(float, input().split())
        result += p*x
    print("#{} {}".format(tc, result))