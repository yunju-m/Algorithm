T = int(input())
for test_case in range(1, T + 1):
    N = int(input())
    bus_stop = [0] * 5001
    for _ in range(N):
        A, B = map(int, input().split())
        for i in range(A, B+1):
            bus_stop[i] += 1
            
    P = int(input())
    print(f"#{test_case}", end = " ")
    for i in range(P):
        C = int(input())
        print(bus_stop[C], end=" ")
    print()