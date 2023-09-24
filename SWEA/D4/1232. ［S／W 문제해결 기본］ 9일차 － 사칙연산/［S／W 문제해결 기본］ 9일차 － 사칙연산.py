def solve(v):
    for a, b, c, d in calc[::-1]:
        if b == '+':
            tree[int(a)] = tree[int(c)] + tree[int(d)]
        elif b == '-':
            tree[int(a)] = tree[int(c)] - tree[int(d)]
        elif b == '*':
            tree[int(a)] = tree[int(c)] * tree[int(d)]
        elif b == '/':
            tree[int(a)] = tree[int(c)] // tree[int(d)]

T = 10
for t_case in range(1, T+1):
    N = int(input())
    tree = [0] * 1001
    tree_cal = [''] * 1001
    calc = []
    for n in range(N):
        n = input().split()
        if len(n) == 2:
            tree[int(n[0])] = int(n[1])
        else:
            calc.append(n)
    solve(1)
    print(f'#{t_case}', tree[1])