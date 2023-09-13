T = 10

for test_case in range(1, T + 1):
    N = int(input())
    apt = list(map(int, input().split()))
    result = 0
    i = 2
    while i < N-2:
        if apt[i] > apt[i-1] and apt[i] > apt[i-2] and apt[i] > apt[i+1] and apt[i] > apt[i+2]:
            	result += min(apt[i] - apt[i-2], apt[i] - apt[i-1], apt[i]-apt[i+1], apt[i]-apt[i+2])
            	i+=1
        i+=1
    print(f"#{test_case} {result}")