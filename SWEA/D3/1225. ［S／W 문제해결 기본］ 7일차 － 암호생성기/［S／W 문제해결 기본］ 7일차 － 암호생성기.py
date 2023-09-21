T = 10

for test_case in range(1, T + 1):
    t_case = int(input())
    stack = list(map(int, input().split()))
    cycle = True
    while cycle:
        for i in range(1, 6):
            num = stack.pop(0)
            num -= i
            stack.append(num)
            if num <= 0:
                stack[-1] = 0
                cycle = False
                break
    print(f"#{t_case}", *stack)