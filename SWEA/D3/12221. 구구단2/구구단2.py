T = int(input())
for test_case in range(1, T + 1):
    A, B = map(int, input().split())
    if A <= 9 and B <= 9:
        result = A*B
    else:
        result = -1
    print('#{} {}'.format(test_case, result))