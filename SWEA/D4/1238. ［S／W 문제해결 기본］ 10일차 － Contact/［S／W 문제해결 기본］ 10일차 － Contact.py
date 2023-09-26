for t_case in range(1,11):
    length, start = map(int,input().split())
    InputData = list(map(int,input().split()))
    contact = [[0]*101 for _ in range(101)]
    for k in range(0, length, 2):
        contact[InputData[k]][InputData[k+1]] = 1
        
    used = [0]*101
    used[start] = 1
    q = [start]
    result = start
    
    while q:
        num= q.pop(0)
        if used[result] < used[num] or (used[result] == used[num] and result < num):
            result = num
            
        for i in range(101):
            if contact[num][i] and used[i]==0:
                q.append(i)
                used[i] = used[num]+1                
    print(f'#{t_case} {result}')