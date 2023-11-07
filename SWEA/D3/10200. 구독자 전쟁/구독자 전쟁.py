T = int(input())
for tc in range(1, T+1):
    n, a, b = map(int, input().split())
    minNum = min(a, b)
    maxNum = n - (a+b)
    if maxNum > 0:
        maxNum = 0
    else:
        maxNum = abs(maxNum)
    print("#{} {} {}".format(tc,minNum, maxNum))