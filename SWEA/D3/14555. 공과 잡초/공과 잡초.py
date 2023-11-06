T = int(input())
for tc in range(1, T+1):
    S = input()
    print("#{} {}".format(tc, S.count("(") + S.count(")") - S.count("()")))