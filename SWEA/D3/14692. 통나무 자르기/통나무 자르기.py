TC = int(input())
for tc in range(1, TC+1):
    N = int(input())
    if N %2 == 0:
        result = "Alice"
    else:
        result = "Bob"
    print("#{} {}".format(tc, result))