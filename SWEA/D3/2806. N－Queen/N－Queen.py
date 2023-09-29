def check(info,turn):
    global N,cnt
    if turn == N: 
        cnt += 1
        return
    tmp = [0]*N
    for i in range(len(info)):
        tmp[info[i]] = 1
        if info[i]-(turn-i)>=0:
            tmp[info[i]-(turn-i)] = 1
        if info[i]+(turn-i)<N:
            tmp[info[i]+(turn-i)] = 1
    for j in range(N):
        if tmp[j] == 0:
            check(info+[j],turn+1)

for tc in range(int(input())):
    N = int(input())
    cnt = 0
    check([],0)
    print("#{} {}".format(tc+1,cnt))