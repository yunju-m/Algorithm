def dfs(depth, start):
    global result
   
    if depth == len_:  
        lemon = 1  
        bad = 0
        for i in arr:  
            lemon *= i[0] 
            bad += i[1] 
        if abs(bad - lemon) < result: 
            result = abs(bad - lemon)  
        return  
 
    for i in range(start, N):
        arr.append(cuisine[i])
        dfs(depth + 1, i + 1)
        arr.pop()


N = int(input())
cuisine = [list(map(int, input().split())) for i in range(N)]
arr = []
result = 1 << 100  

for i in range(1, N + 1): 
    len_ = i
    dfs(0, 0)

print(result)