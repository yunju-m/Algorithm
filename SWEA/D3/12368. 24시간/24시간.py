T = int(input())
for test_case in range(1, T + 1):
    A, B = map(int, input().split())
    time = A+B
    if time >= 24:
        time = time % 24
    print('#{} {}'.format(test_case, time))