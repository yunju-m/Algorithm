def pibo(n):
    if n < 2:
        return 1
    else:
        return n * pibo(n-1)
n = int(input())
print(pibo(n))