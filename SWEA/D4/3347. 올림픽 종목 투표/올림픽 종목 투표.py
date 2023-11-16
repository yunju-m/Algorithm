T = int(input())
for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    events = list(map(int, input().strip().split()))
    managers = list(map(int, input().strip().split()))
    
    vote = [0] * N  
    for manager in managers:
        for i, event in enumerate(events):
            if event <= manager:
                vote[i] += 1
                break

    answer = [0, 0]  
    for i in range(N):
        if vote[i] > answer[1]:
            answer = [i + 1, vote[i]]

    print(f'#{test_case} {answer[0]}')