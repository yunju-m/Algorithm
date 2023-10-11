def find_p(x):
    if x == p[x]:
        return x
    else:
        return find_p(p[x])
    
T = int(input())
for tc in range(1, T + 1):
    n, m = map(int, input().split())
    p = [i for i in range(n+1)]
    for _ in range(m):
        p1, p2 = map(int, input().split())
        p[find_p(p1)] = find_p(p2)
        
    result = 0
    for i in range(1, n+1):
        if i == p[i]:
            result += 1
    print("#{} {}".format(tc, result))
        