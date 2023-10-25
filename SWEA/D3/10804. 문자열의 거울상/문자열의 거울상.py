T = int(input())
for tc in range(1, T+1):
    S = input()
    result = ''
    for s in S:
        if s == 'p':
            result += 'q'
        elif s == 'q':
            result += 'p'
        elif s == 'b':
            result += 'd'
        elif s == 'd':
            result += 'b'
    print("#{} {}".format(tc, result[::-1]))