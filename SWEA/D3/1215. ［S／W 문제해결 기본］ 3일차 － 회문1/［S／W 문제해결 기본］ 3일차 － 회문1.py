T = 10

for test_case in range(1, T + 1):
    pd_len = int(input())
    arr = [list(input()) for _ in range(8)]
    cnt = 0
   
    for i in range(8):
        for j in range(8-pd_len+1):
            if arr[i][j:j+pd_len] == arr[i][j:j+pd_len][::-1]:
                cnt +=1

    for i in range(8):
        for j in range(8-pd_len+1):
            s = ""
            for k in range(pd_len):
                s += arr[j+k][i]
            if s == s[::-1]:
                cnt+=1
    print(f"#{test_case} {cnt}")