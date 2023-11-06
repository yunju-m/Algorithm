T = int(input())
for tc in range(1, T+1):
    S = input()
    result = "Yes"
    for s in S:
        cnt = S.count(s)
        if cnt != 2:
            result = "No"
            break
    print("#{} {}".format(tc, result))