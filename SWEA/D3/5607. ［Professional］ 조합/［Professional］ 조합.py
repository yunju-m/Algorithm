MOD = 1234567891
def fermat(n, x):
    if x == 0:
        return 1
    tmp = fermat(n, x//2)
    ret = (tmp*tmp) % MOD
    if x % 2 == 0:
        return ret
    else:
        return (ret * n) % MOD

T = int(input())
for test_case in range(1, T + 1):
    n, r = map(int, input().split())
    arr = [0]*(n+1)
    arr[0] = 1
    for i in range(1, n+1):
        arr[i] = ((arr[i-1]) * i) % MOD
    bottom = (arr[r] * arr[n-r]) % MOD
    rebottom = fermat(bottom, MOD-2)
    print(f"#{test_case} {(arr[n] *rebottom) % MOD}")
    