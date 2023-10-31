T = int(input())
for tc in range(1, T+1):
    n, k = map(int,  input().split())
    result = 0
    score = list(map(int, input().split()))
    score.sort(reverse = True)
    for j in range(k):
        result += score[j]
    print("#{} {}".format(tc, result))