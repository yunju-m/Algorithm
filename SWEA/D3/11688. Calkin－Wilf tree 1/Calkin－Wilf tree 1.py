T = int(input())
for test_case in range(1, T + 1):
    dir = input()
    a = 1
    b = 1
    for d in dir:
        if d == 'L':
            a = a
            b = a+b
        else:
            a = a+b
            b = b
    print("#{} {} {}".format(test_case, a, b))