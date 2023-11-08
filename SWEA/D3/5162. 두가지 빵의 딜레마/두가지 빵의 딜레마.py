T = int(input())
for tc in range(1, T+1):
    A, B, C = map(int, input().split())
    minprice = min(A, B)
    totalBread = C // minprice
    print("#{} {}".format(tc, totalBread))