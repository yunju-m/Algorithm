for tc in range(1,int(input())+1):
    n,m = map(int,input().split()) 
    arr = [list(input()) for _ in range(n)]
    mymin = n*m
    one_cnt = 0
    for w in range(0,n-2):
        for k in range(0,m):
            if arr[w][k] != 'W':
                one_cnt += 1
  
        two_cnt = 0
        for b in range(w+1,n-1): # 블루
            for k in range(0,m):
                if arr[b][k] != 'B':
                    two_cnt += 1
  
            three_cnt = 0
            for r in range(b+1,n): # 레드
                for k in range(0,m):
                    if arr[r][k] != 'R':
                        three_cnt += 1
           
            cnt = one_cnt + two_cnt + three_cnt
            if mymin > cnt:
                mymin = cnt
    print(f'#{tc} {mymin}')