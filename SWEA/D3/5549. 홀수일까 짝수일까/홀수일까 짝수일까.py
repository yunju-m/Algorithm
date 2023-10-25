T = int(input())
for tc in range(1, T+1):
    n = int(input())
    if n % 2 == 0:
        result = "Even"
    else:
        result = "Odd"
    print("#{} {}".format(tc, result))