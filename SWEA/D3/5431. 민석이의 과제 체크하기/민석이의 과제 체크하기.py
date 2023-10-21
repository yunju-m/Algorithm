T = int(input())
for test_case in range(1, T + 1):
    n, k = map(int, input().split())
    arr = list(map(int, input().split()))
    print("#{} ".format(test_case), end = "")
    for i in range(1, n+1):
        if not i in arr:
            print(i, end=" ")
    print()