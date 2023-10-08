T = int(input())
for test_case in range(1, T + 1):
    N = int(input())
    result = 0
    for x in range(-N, N+1):
        for y in range(-N, N+1):
            if x**2 + y**2 <= N**2:
                result += 1
    print(f"#{test_case} {result}")
                