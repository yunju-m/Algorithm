import sys 
input = sys.stdin.readline 
N = int(input()) 
friend = [list(input()) for _ in range(N)] 
visit = [[0 for _ in range(N)] for _ in range(N)] 
for i in range(N): 
    for j in range(N):
        for k in range(N): 
            if j == k: continue 
            if friend[j][k]=='Y' or (friend[j][i]=='Y' and friend[i][k]=='Y'):
                visit[j][k] = 1
result = 0 
for i in visit:
    result = max(result, sum(i))
print(result) 
