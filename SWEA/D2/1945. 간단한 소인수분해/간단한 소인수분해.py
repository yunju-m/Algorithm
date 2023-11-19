def is_primeNumber(n):
    factors = []
    i = 2
    while i <= n:
        if n % i == 0:
            factors.append(i)
            n = n / i
        else:
            i = i + 1
    return factors

T = int(input())
primeNumber = [2, 3, 5, 7, 11]
for tc in range(1, T+1):
    n = int(input())
    result = is_primeNumber(n)
    a = result.count(2)
    b = result.count(3)
    c = result.count(5)
    d = result.count(7)
    e = result.count(11)
    print("#%d %d %d %d %d %d" %(tc, a, b, c, d, e))
    
         