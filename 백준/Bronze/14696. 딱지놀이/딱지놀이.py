def round(maxShape):
    a_max_num, b_max_num = a[1:].count(maxShape), b[1:].count(maxShape)
    if a_max_num == b_max_num:
        if maxShape == 0:
            return 'D'
        else:
            return round(maxShape-1)
    elif a_max_num > b_max_num:
        return 'A'
    else:
        return 'B'

roundNum = int(input())
for _ in range(roundNum):
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    
    maxA, maxB = max(a[1:]), max(b[1:])
    if maxA != maxB:
        if maxA > maxB:
            print('A')
        else:
            print('B')
    else:
        print(round(maxA))