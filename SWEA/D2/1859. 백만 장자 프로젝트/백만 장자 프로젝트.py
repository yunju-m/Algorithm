T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    arr = list(map(int, input().split()))
    result = 0
    while len(arr) != 0:
        maxNum = max(arr)
        maxNumidx = arr.index(max(arr))
        beforeArr = arr[:maxNumidx]
        arr = arr[maxNumidx+1:]

        for i in range (len(beforeArr)):
                result += abs(beforeArr[i]-maxNum)
    print(f"#{test_case} {result}") 