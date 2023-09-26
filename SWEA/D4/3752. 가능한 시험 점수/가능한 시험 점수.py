T = int(input())
for test_case in range(1, T + 1):
    n = int(input())
    scores = list(map(int, input().split()))
    my_scores = [0] * (sum(scores) + 1)
    my_scores[0] = 1  

    for score in scores:
        for i in range(len(my_scores) - score, -1, -1):
            if my_scores[i]:
                my_scores[i + score] = 1
    print(f'#{test_case} {sum(my_scores)}')