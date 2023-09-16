T = 10
 
for test_case in range(1, T + 1):
    num = int(input())
    arr = [list(input()) for _ in range(100)]
    col_pd_len = 100
    Find = False
     
    for i in range(100):
        for k in range(100):
            for j in range(100-col_pd_len+1):
                if arr[k][j:j+col_pd_len] == arr[k][j:j+col_pd_len][::-1]:
                    Find = True
                    break
        if Find:
            break
        else:
            col_pd_len -= 1
             
    row_pd_len = 100
    Find = False
    for i in range(100):
        for m in range(100):
            for j in range(100-row_pd_len+1):
                s = ""
                for k in range(row_pd_len):
                    s += arr[j+k][m]
                if s == s[::-1]: 
                    Find = True
                    break
        if Find:
            break
        else:
            row_pd_len -= 1
    pd_len = max(col_pd_len, row_pd_len)
    print(f"#{num} {pd_len}")